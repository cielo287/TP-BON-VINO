
package Boundary;


public class InterfazExcel {
    public String exportarExcel( Integer cantidadVinos) {
        if(cantidadVinos == null){
            return "El excel fue generado vacío ya que no hay vinos para las fechas solicitadas :/ ¡inténtalo de nuevo!";
        } else {
            return "¡Excel generado con éxito! Buscalo en tu carpeta de descargas y conocé cuales son los mejores vinos.";
        }

    }
}
