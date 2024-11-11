package Strategy;

import Entity.Pais;
import Entity.Vino;

import java.time.LocalDate;
import java.util.List;

public class EstrategiaAmigos implements IEstrategiaReporte{

    public EstrategiaAmigos() {
    }

    @Override
    public String[][] generarRanking(List<Vino> vinos, List<Pais> listaPaises, LocalDate fechaDesde, LocalDate fechaHasta) {
        return new String[0][];
    }
}
