package Control;

import Boundary.InterfazExcel;
import Boundary.PantallaRankingVinos;
import Entity.Pais;
import Entity.Vino;
import Strategy.EstrategiaAmigos;
import Strategy.EstrategiaNormales;
import Strategy.EstrategiaSommelier;
import Strategy.IEstrategiaReporte;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.io.IOException;

public class GestorRankingVinos {

    //ATRIBUTOS
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String tipoResenaSeleccionada;
    private String tipoVisualizacionReporteSeleccionado;
    private Boolean confirmacionReporte;
    private String[][] reporte;
    private IEstrategiaReporte estrategiaReporte;

    //GETTER Y SETTER
    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getTipoResenaSeleccionada() {
        return tipoResenaSeleccionada;
    }

    public void setTipoResenaSeleccionada(String tipoResenaSeleccionada) {
        this.tipoResenaSeleccionada = tipoResenaSeleccionada;
    }

    public String getTipoVisualizacionReporteSeleccionado() {

        return tipoVisualizacionReporteSeleccionado;
    }

    public void setTipoVisualizacionReporteSeleccionado(String tipoVisualizacionReporteSeleccionado) {
        this.tipoVisualizacionReporteSeleccionado = tipoVisualizacionReporteSeleccionado;
    }

    public Boolean getConfirmacionReporte() {
        return confirmacionReporte;
    }

    public void setConfirmacionReporte(Boolean confirmacionReporte) {
        this.confirmacionReporte = confirmacionReporte;
    }

    public String[][] getReporte() {
        return reporte;
    }

    public void setReporte(String[][] reporte) {
        this.reporte = reporte;
    }

    public IEstrategiaReporte getEstrategiaReporte() {
        return estrategiaReporte;
    }

    public void setEstrategiaReporte(IEstrategiaReporte estrategiaReporte) {
        this.estrategiaReporte = estrategiaReporte;
    }

    //CONSTRUCTOR
    public GestorRankingVinos() {
    }

    //OTROS METODOS
    public void opGenerarRankingDeVinos(PantallaRankingVinos pantalla) {
        //Se pide a la pantalla que solicite las fechas desde y hasta para sacar el reporte.
        pantalla.solicitarFechaDesdeYHasta();
    }
    public void tomarFechasDesdeHasta(LocalDate fechaDesde, LocalDate fechaHasta, PantallaRankingVinos pantalla) {
        //El gestor setea las correspondientes fechas.
        setFechaDesde(fechaDesde);
        setFechaHasta(fechaHasta);

        //Luego la pantalla pasa a solicitar el tipo de reseña.
        pantalla.solicitarTipoResena();
    }
    public void tomarTipoResena(String tipoResena, PantallaRankingVinos pantalla) {
        //El gestor setea el tipo de reseña.
        setTipoResenaSeleccionada(tipoResena);

        //Luego la pantalla pasa a solicitar la forma de visualización.
        pantalla.mostrarFormasDeVisualizPSeleccion();
    }
    public void tomarFormaDeVisualiz(String formaVisualizacion, PantallaRankingVinos pantalla) {
        //El gestor setea el tipo de reporte seleccionado.
        setTipoVisualizacionReporteSeleccionado(formaVisualizacion);

        //Luego la pantalla pasa a solicitar la confirmación del reporte.
        pantalla.solicitarConfPGReporte();
    }
    public void tomarConfPGReporte(boolean confirmacion, List<Vino> vinos, List<Pais> listaPaises, PantallaRankingVinos pantalla, InterfazExcel interfazExcel) throws IOException, WriteException {
        //El gestor setea la confirmación del reporte.
        setConfirmacionReporte(confirmacion);

        //Se crea la estrategia dependiendo del tipo de reseña seleccionada.
        IEstrategiaReporte strategy = crearEstrategia(tipoResenaSeleccionada);

        //Se llama a la estategia correspondiente para que genere el reporte solicitado.
        reporte = strategy.generarRanking(vinos,listaPaises,fechaDesde,fechaHasta);

        //Se procede a generar el archivo de Excel.
        generarArchivoExcel(pantalla,interfazExcel);
    }

    private IEstrategiaReporte crearEstrategia(String tipoResenaSeleccionada) {
        //Se crea la estrategia según el tipo de reseña seleccionada.
        IEstrategiaReporte strategy;

        if(tipoResenaSeleccionada.equals("Reseñas de Sommelier")){
            strategy = new EstrategiaSommelier();
        } else if(tipoResenaSeleccionada.equals("Reseñas normales")){
            strategy = new EstrategiaNormales();
        } else if(tipoResenaSeleccionada.equals("Reseñas de Amigos")){
            strategy = new EstrategiaAmigos();
        } else {
            return null;
        }

        return strategy;
    }

    public void generarArchivoExcel(PantallaRankingVinos pantalla, InterfazExcel interfazExcel) throws IOException, WriteException {
        String userHome = System.getProperty("user.home");
        String downloadDir = userHome + File.separator + "Downloads";
        String nombreArchivo = downloadDir + File.separator + "Ranking de Vinos.xls";
        WritableWorkbook workbook = Workbook.createWorkbook(new File(nombreArchivo));
        WritableSheet sheet = workbook.createSheet("Ranking",0);
        Integer cantidadVinosExport = null;

        sheet.addCell(new Label(0,0,"Posición general"));
        sheet.addCell(new Label(1,0,"Nombre Vino"));
        sheet.addCell(new Label(2,0,"Precio Vino"));
        sheet.addCell(new Label(3,0,"Calificacion Sommelier"));
        sheet.addCell(new Label(4,0,"Nombre Bodega"));
        sheet.addCell(new Label(5,0,"Descripcion Varietal"));
        sheet.addCell(new Label(6,0,"Nombre Región Vitivinicola"));
        sheet.addCell(new Label(7,0,"Pais"));

        if(reporte != null){
            cantidadVinosExport = reporte.length;
            for (int i = 1; i <= cantidadVinosExport; i++) {

                sheet.addCell(new Label(0,i, reporte[i-1][0]));
                sheet.addCell(new Label(1,i, reporte[i-1][1]));
                sheet.addCell(new Label(2,i, reporte[i-1][2]));
                sheet.addCell(new Label(3,i, reporte[i-1][3]));
                sheet.addCell(new Label(4,i, reporte[i-1][4]));
                sheet.addCell(new Label(5,i, reporte[i-1][5]));
                sheet.addCell(new Label(6,i, reporte[i-1][6]));
                sheet.addCell(new Label(7,i, reporte[i-1][7]));
            }
        }

        workbook.write();
        workbook.close();

        String informe = interfazExcel.exportarExcel(cantidadVinosExport);

        pantalla.informarGeneracionExitosa(informe);

    }
    public void finCU() {
        System.out.println("Fin del Caso de Uso");
        System.exit(0);
    }

}