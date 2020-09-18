package lab8;

import java.awt.Color;

public class Comic extends Articulo{
    private int numeroVolumen;
    private String descripcionComic;
    private int estadoCalidad;

    public Comic() {
    }

    public Comic(int numeroVolumen, String descripcionComic, int estadoCalidad, String titulo, Color color, String descripcionArticulo, String editorial, int tamaño, float puntuacion, Persona personaRegistro) {
        super(titulo, color, descripcionArticulo, editorial, tamaño, puntuacion, personaRegistro);
        setNumeroVolumen(numeroVolumen);
        this.descripcionComic = descripcionComic;
        setEstadoCalidad(estadoCalidad);
    }

    public int getEstadoCalidad() {
        return estadoCalidad;
    }

    public void setEstadoCalidad(int estadoCalidad) {
        if (estadoCalidad>0 && estadoCalidad<11) {
            this.estadoCalidad = estadoCalidad;
        }
    }

    public int getNumeroVolumen() {
        return numeroVolumen;
    }

    public void setNumeroVolumen(int numeroVolumen) {
        if (numeroVolumen>0) {
            this.numeroVolumen = numeroVolumen;
        }
        
    }

    public String getDescripcionComic() {
        return descripcionComic;
    }

    public void setDescripcionComic(String descripcionComic) {
        this.descripcionComic = descripcionComic;
    }

    @Override
    public String toString() {
        return "Comic" + super.toString();
    }
    
}
