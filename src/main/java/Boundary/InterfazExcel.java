
package Boundary;


public class InterfazExcel {
    public String exportarExcel( Integer cantidadVinos) {
        if(cantidadVinos == null){
            return "No se obtuvieron resultados para las fechas seleccionadas.";
        } else {
            return "Se guardó el Excel del Ranking solicitado en C:\\Users\\Usuario\\Downloads";
        }

    }
}
