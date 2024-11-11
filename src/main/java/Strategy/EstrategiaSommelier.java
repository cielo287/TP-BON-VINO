package Strategy;

import Entity.Pais;
import Entity.Vino;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EstrategiaSommelier implements IEstrategiaReporte{

    private List<Vino> listaVinosConSommelier;

    private String[][] listaTopDiezVinos;

    public EstrategiaSommelier(){
    }

    @Override
    public String[][] generarRanking(List<Vino> vinos, List<Pais> listaPaises, LocalDate fechaDesde, LocalDate fechaHasta) {

        //Se buscan aquellos vinos que tienen reseña de sommelier.
        buscarVinosConResenasSommeliers(vinos,fechaDesde,fechaHasta);

        ordenarVinosSegunCalificación(listaPaises);

        obtenerDatosTop10(listaPaises);

        return listaTopDiezVinos;
    }

    public void buscarVinosConResenasSommeliers(List<Vino> vinos, LocalDate fechaDesde, LocalDate fechaHasta){

        listaVinosConSommelier = new ArrayList<>();

        //Se recorren todos los vinos de la DB para determinar cuales tienen reseña.
        vinos.stream().forEach(vino ->{
            if(vino.tieneResenaPremium(fechaDesde,fechaHasta)){
                listaVinosConSommelier.add(vino);
            }
        });

        // Se calcula el promedio de la calificaciones recibidas.
        listaVinosConSommelier.stream().forEach(vino ->{
            vino.calcularPromedioCalif(fechaDesde,fechaHasta);
        });

    }
    public void ordenarVinosSegunCalificación(List<Pais> listaPaises){
        // Se ordenan los vinos según la calificación promedio obtenida.
        listaVinosConSommelier.sort(Comparator.comparing(Vino::getPromedioCalificacion).reversed());
    }

    public void obtenerDatosTop10(List<Pais> listaPaises) {
        //Se filtra el top 10 y se crea el reporte.

        int cantidadVinos = listaVinosConSommelier.size() > 10 ? 10 : listaVinosConSommelier.size();

        if(cantidadVinos > 0){
            listaTopDiezVinos = new String[cantidadVinos][8];
        }

        int posicionGeneral = 0;

        while(posicionGeneral < cantidadVinos){
            posicionGeneral = obtenerCalificacionGeneral(posicionGeneral);
            Vino vino = listaVinosConSommelier.get(posicionGeneral-1);

            listaTopDiezVinos[posicionGeneral-1][0]= String.valueOf(posicionGeneral);
            listaTopDiezVinos[posicionGeneral-1][1]=vino.getNombre();
            listaTopDiezVinos[posicionGeneral-1][2]=String.valueOf(vino.getPrecio());
            listaTopDiezVinos[posicionGeneral-1][3]=String.valueOf(vino.getPromedioCalificacion());
            listaTopDiezVinos[posicionGeneral-1][4]=vino.obtenerNombreBodega();
            listaTopDiezVinos[posicionGeneral-1][5]=vino.obtenerDescripcionVarietal();
            listaTopDiezVinos[posicionGeneral-1][6]=vino.obtenerNombreRegionVitinicola();
            listaTopDiezVinos[posicionGeneral-1][7]=vino.obtenerUbicacion(listaPaises);
        }

    }

    public int obtenerCalificacionGeneral(int posicionGeneral) {
        return posicionGeneral + 1;
    }
}
