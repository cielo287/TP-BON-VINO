
package Entity;

import java.util.List;

public class RegionVitivinicola {

    //ATRIBUTOS
    private String descripcion;
    private String nombre;

    //GETTERS Y SETTERS

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //OTROS METODOS
    public String obtenerNombrePais(List<Pais> paises){
        for (Pais pais: paises) {
            for (Provincia provincia: pais.getProvincias()) {
                for (RegionVitivinicola region: provincia.getRegionesVitivinicolas()) {
                    if (region.getNombre().equals(this.nombre))
                            return provincia.obtenerNombrePais(paises);
                }
            }
        }
        return "País no encontrado.";
    }
}