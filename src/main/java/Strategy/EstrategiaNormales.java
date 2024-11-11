package Strategy;

import Entity.Pais;
import Entity.Vino;

import java.time.LocalDate;
import java.util.List;

public class EstrategiaNormales implements IEstrategiaReporte{

    public EstrategiaNormales() {
    }

    @Override
    public String[][] generarRanking(List<Vino> vinos, List<Pais> listaPaises, LocalDate fechaDesde, LocalDate fechaHasta) {
        return new String[0][];
    }
}
