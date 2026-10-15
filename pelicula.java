package proyecto;

import java.util.ArrayList;
import java.util.List;

public class pelicula {
    private String titulo;
    private String director;
    private int anio;
    private double media;
    private List<reseñas> reseñas;

    public pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.reseñas = new ArrayList<>();
    }

    public List<reseñas> getReseñas() {
        return reseñas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAnio() {
        return anio;
    }

    public double getMedia() {
        return media;
    }

    public void setReseñas(List<reseñas> reseñas) {
        this.reseñas = reseñas;
    }
}
