package DataBase;

import Entity.Pais;
import Entity.Provincia;
import Entity.RegionVitivinicola;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PaisDAO {
    public List<Pais> obtenerPaises() {
        List<Pais> paises = new ArrayList<>();
        String queryPaises = "SELECT * FROM Pais";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statementPaises = connection.prepareStatement(queryPaises);
             ResultSet resultSetPaises = statementPaises.executeQuery()) {

            while (resultSetPaises.next()) {

                List<Provincia> provincias = cargarProvincias(connection, resultSetPaises.getInt("id"));

                Pais pais = new Pais(resultSetPaises.getInt("id"),resultSetPaises.getString("nombre"), provincias);

                paises.add(pais);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return paises;
    }

    private List<Provincia> cargarProvincias(Connection connection, int paisId) throws SQLException {
        List<Provincia> provincias = new ArrayList<>();
        String queryProvincias = "SELECT * FROM Provincia WHERE pais_id = ?";

        try (PreparedStatement statementProvincias = connection.prepareStatement(queryProvincias)) {
            statementProvincias.setInt(1, paisId);
            ResultSet resultSetProvincias = statementProvincias.executeQuery();

            while (resultSetProvincias.next()) {

                List<RegionVitivinicola> regiones = cargarRegiones(connection, resultSetProvincias.getInt("id"));

                Provincia provincia = new Provincia(resultSetProvincias.getInt("id"),resultSetProvincias.getString("nombre"),regiones);

                provincias.add(provincia);
            }
        }
        return provincias;
    }

    private List<RegionVitivinicola> cargarRegiones(Connection connection, int provinciaId) throws SQLException {
        List<RegionVitivinicola> regiones = new ArrayList<>();
        String queryRegiones = "SELECT * FROM RegionVitivinicola WHERE provincia_id = ?";

        try (PreparedStatement statementRegiones = connection.prepareStatement(queryRegiones)) {
            statementRegiones.setInt(1, provinciaId);
            ResultSet resultSetRegiones = statementRegiones.executeQuery();

            while (resultSetRegiones.next()) {
                RegionVitivinicola region = new RegionVitivinicola(resultSetRegiones.getInt("id"),resultSetRegiones.getString("descripcion"),resultSetRegiones.getString("nombre"));

                regiones.add(region);
            }
        }
        return regiones;
    }
}
