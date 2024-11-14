
package Entity;

import java.util.List;

public class Provincia {

    //ATRIBUTOS
    private int id;
    private String nombre;
    private List<RegionVitivinicola> regionesVitivinicolas;

    //CONSTRUCTOR

    public Provincia(int id, String nombre, List<RegionVitivinicola> regionesVitivinicolas) {
        this.id = id;
        this.nombre = nombre;
        this.regionesVitivinicolas = regionesVitivinicolas;
    }


    //GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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