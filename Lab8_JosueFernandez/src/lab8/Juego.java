package lab8;

import java.awt.Color;

public class Juego extends Articulo{
    private int numeroEdicion;
    private String casaDeElaboracion;
    private String paisDondeSeHizo;

    public Juego() {
    }

    public Juego(int numeroEdicion, String casaDeElaboracion, String paisDondeSeHizo, String titulo, Color color, String descripcionArticulo, String editorial, int tamaño, float puntuacion, Persona personaRegistro) {
        super(titulo, color, descripcionArticulo, editorial, tamaño, puntuacion, personaRegistro);
        setNumeroEdicion(numeroEdicion);
        this.casaDeElaboracion = casaDeElaboracion;
        this.paisDondeSeHizo = paisDondeSeHizo;
    }

    public String getPaisDondeSeHizo() {
        return paisDondeSeHizo;
    }

    public void setPaisDondeSeHizo(String paisDondeSeHizo) {
        this.paisDondeSeHizo = paisDondeSeHizo;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        if (numeroEdicion>0) {
            this.numeroEdicion = numeroEdicion;
        }
        
    }

    public String getCasaDeElaboracion() {
        return casaDeElaboracion;
    }

    public void setCasaDeElaboracion(String casaDeElaboracion) {
        this.casaDeElaboracion = casaDeElaboracion;
    }

    @Override
    public String toString() {
        return "Juego" + super.toString();
    }
    
}
