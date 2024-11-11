package Strategy;

import Entity.Pais;
import Entity.Vino;

import java.time.LocalDate;
import java.util.List;

public interface IEstrategiaReporte {
    public String[][] generarRanking(List<Vino> vinos, List<Pais> listaPaises, LocalDate fechaDesde, LocalDate fechaHasta);
}
