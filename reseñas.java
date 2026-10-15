package proyecto;

import java.util.Date;

public class reseñas {
    private String nombre;
    private String comentario;
    private int calificacion;
    private Date fecha;

    public reseñas(String nombre, String comentario, int calificacion) {
        this.nombre = nombre;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}
