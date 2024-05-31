
package Entity;

import java.util.List;

public class Provincia {

    //ATRIBUTOS
    private String nombre;
    private List<RegionVitivinicola> regionesVitivinicolas;

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<RegionVitivinicola> getRegionesVitivinicolas() {
        return regionesVitivinicolas;
    }

    public void setRegionesVitivinicolas(List<RegionVitivinicola> regionesVitivinicolas) {
        this.regionesVitivinicolas = regionesVitivinicolas;
    }

    //OTROS METODOS

    public String obtenerNombrePais(List<Pais> paises){
        for (Pais pais: paises) {
            for (Provincia provincia: pais.getProvincias()) {
                if (provincia.getNombre().equals(this.nombre))
                    return pais.getNombre();
            }
        }
        return "País no encontrado.";
    }
}