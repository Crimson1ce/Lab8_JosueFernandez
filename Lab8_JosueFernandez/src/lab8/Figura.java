package lab8;

import java.awt.Color;

public class Figura extends Articulo{
    private String descripcionFigura;
    private String instruccionesDeArmado;
    private int tiempoDeGarantia;

    public Figura() {
    }

    public Figura(String descripcionFigura, String instruccionesDeArmado, int tiempoDeGarantia, String titulo, Color color, String descripcionArticulo, String editorial, int tamaño, float puntuacion, Persona personaRegistro) {
        super(titulo, color, descripcionArticulo, editorial, tamaño, puntuacion, personaRegistro);
        this.descripcionFigura = descripcionFigura;
        this.instruccionesDeArmado = instruccionesDeArmado;
        setTiempoDeGarantia(tiempoDeGarantia);
    }

    public int getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        if (tiempoDeGarantia>=0) {
            this.tiempoDeGarantia = tiempoDeGarantia;
        }
        
    }

    public String getDescripcionFigura() {
        return descripcionFigura;
    }

    public void setDescripcionFigura(String descripcionFigura) {
        this.descripcionFigura = descripcionFigura;
    }

    public String getInstruccionesDeArmado() {
        return instruccionesDeArmado;
    }

    public void setInstruccionesDeArmado(String instruccionesDeArmado) {
        this.instruccionesDeArmado = instruccionesDeArmado;
    }

    @Override
    public String toString() {
        return "Figura" + super.toString();
    }
    
}
