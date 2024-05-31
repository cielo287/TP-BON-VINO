
package Entity;


import java.time.LocalDate;

public class Resena {
    //ATRIBUTOS
    private String comentario;
    private boolean esPremium;
    private LocalDate fechaResena;
    private Double puntaje;

    //GETTERS Y SETTERS
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean getEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public LocalDate getFechaResena() {
        return fechaResena;
    }

    public void setFechaResena(LocalDate fechaResena) {
        this.fechaResena = fechaResena;
    }

    //OTROS METODOS
     public boolean esDePeriodo(LocalDate fechaDesde, LocalDate fechaHasta){
        return (this.fechaResena.isAfter(fechaDesde) && this.fechaResena.isBefore(fechaHasta));
    }
}
