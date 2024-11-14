package DataBase;

import Entity.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VinoDAO {
    public List<Vino> obtenerVinos() {
        List<Vino> vinos = new ArrayList<>();
        String queryVinos = "SELECT * FROM Vino";  // Consulta para obtener vinos
        String queryVarietales = "SELECT * FROM Varietal WHERE vino_id = ?";  // Obtener varietales por vino
        String queryBodegas = "SELECT * FROM Bodega WHERE id = ?";  // Obtener bodega por id
        String queryRegionVitivinicola = "SELECT * FROM RegionVitivinicola WHERE id = ?";  // Obtener región vitivinícola
        String queryResenas = "SELECT * FROM Resena WHERE vino_id = ?";  // Obtener reseñas por vino

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statementVinos = connection.prepareStatement(queryVinos);
             ResultSet resultSetVinos = statementVinos.executeQuery()) {

            while (resultSetVinos.next()) {
                Vino vino = new Vino();
                vino.setAnada(resultSetVinos.getInt("anada"));
                vino.setImagenEtiqueta(resultSetVinos.getString("imagenEtiqueta"));
                vino.setNombre(resultSetVinos.getString("nombre"));
                vino.setNotaDeCadaBodega(resultSetVinos.getString("notaDeCadaBodega"));
                vino.setPrecio(resultSetVinos.getDouble("precio"));

                // Cargar varietales
                List<Varietal> varietales = cargarVarietales(connection, resultSetVinos.getInt("id"), queryVarietales);
                vino.setVarietal(varietales);

                // Cargar bodega
                Bodega bodega = cargarBodega(connection, resultSetVinos.getInt("bodega_id"), queryBodegas, queryRegionVitivinicola);
                vino.setBodega(bodega);

                // Cargar reseñas
                List<Resena> resenas = cargarResenas(connection, resultSetVinos.getInt("id"), queryResenas);
                vino.setResenas(resenas);

                vinos.add(vino);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vinos;
    }

    private List<Varietal> cargarVarietales(Connection connection, int vinoId, String queryVarietales) throws SQLException {
        List<Varietal> varietales = new ArrayList<>();
        try (PreparedStatement statementVarietales = connection.prepareStatement(queryVarietales)) {
            statementVarietales.setInt(1, vinoId);
            ResultSet resultSetVarietales = statementVarietales.executeQuery();

            while (resultSetVarietales.next()) {
                Varietal varietal = new Varietal();
                varietal.setDescripcion(resultSetVarietales.getString("descripcion"));
                varietal.setPorcentajeComposicion(resultSetVarietales.getDouble("porcentajeComposicion"));
                varietales.add(varietal);
            }
        }
        return varietales;
    }

    private Bodega cargarBodega(Connection connection, int bodegaId, String queryBodegas, String queryRegionVitivinicola) throws SQLException {
        Bodega bodega = null;
        try (PreparedStatement statementBodega = connection.prepareStatement(queryBodegas)) {
            statementBodega.setInt(1, bodegaId);
            ResultSet resultSetBodega = statementBodega.executeQuery();

            if (resultSetBodega.next()) {
                bodega = new Bodega();
                bodega.setNombre(resultSetBodega.getString("nombre"));
                bodega.setDescripcion(resultSetBodega.getString("descripcion"));
                bodega.setHistoria(resultSetBodega.getString("historia"));
                bodega.setCoordenadasUbicacion(resultSetBodega.getString("coordenadasUbicacion"));
                bodega.setPeriodoActualizacion(LocalDate.parse(resultSetBodega.getString("periodoActualizacion")));

                // Cargar región vitivinícola
                RegionVitivinicola region = cargarRegionVitivinicola(connection, resultSetBodega.getInt("region_id"), queryRegionVitivinicola);
                bodega.setRegionVitivinicola(region);
            }
        }
        return bodega;
    }

    private RegionVitivinicola cargarRegionVitivinicola(Connection connection, int regionId, String queryRegionVitivinicola) throws SQLException {
        RegionVitivinicola region = null;
        try (PreparedStatement statementRegion = connection.prepareStatement(queryRegionVitivinicola)) {
            statementRegion.setInt(1, regionId);
            ResultSet resultSetRegion = statementRegion.executeQuery();

            if (resultSetRegion.next()) {
                region = new RegionVitivinicola(resultSetRegion.getInt("id"),resultSetRegion.getString("descripcion"),resultSetRegion.getString("nombre"));

            }
        }
        return region;
    }

    private List<Resena> cargarResenas(Connection connection, int vinoId, String queryResenas) throws SQLException {
        List<Resena> resenas = new ArrayList<>();
        try (PreparedStatement statementResena = connection.prepareStatement(queryResenas)) {
            statementResena.setInt(1, vinoId);
            ResultSet resultSetResena = statementResena.executeQuery();

            while (resultSetResena.next()) {
                Resena resena = new Resena();
                resena.setComentario(resultSetResena.getString("comentario"));
                resena.setEsPremium(resultSetResena.getBoolean("esPremium"));
                resena.setFechaResena(LocalDate.parse(resultSetResena.getString("fechaResena")));
                resena.setPuntaje(resultSetResena.getDouble("puntaje"));
                resenas.add(resena);
            }
        }
        return resenas;
    }
}
