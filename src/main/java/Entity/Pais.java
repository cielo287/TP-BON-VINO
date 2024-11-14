
package Entity;

import java.util.List;

public class Pais {

    //ATRIBUTOS
    private int id;
    private String nombre;
    private List<Provincia> provincias;

    //GETTER Y SETTERS


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

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    //CONSTRUCTOR

    public Pais() {
    }
    public Pais(int id, String nombre, List<Provincia> provincias) {
        this.id = id;
        this.nombre = nombre;
        this.provincias = provincias;
    }
}