package lab8;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Persona implements Serializable{
    
    //Atributos
    private long identificacion;
    private String nombrePersona;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private int altura;
    private int peso;
    private ArrayList<Mensaje> mensajesEnviados = new ArrayList();
    private ArrayList<Mensaje> mensajesRecibidos = new ArrayList();

    //Constructores
    public Persona() {
    }

    public Persona(long identificacion, String nombrePersona, int edad) {
        setIdentificacion(identificacion);
        this.nombrePersona = nombrePersona;
        setEdad(edad);
    }

    public Persona(long identificacion, String nombrePersona, int edad, String sexo, String estadoCivil, int altura, int peso) {
        setIdentificacion(identificacion);
        this.nombrePersona = nombrePersona;
        setEdad(edad);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        setAltura(altura);
        setPeso(peso);
    }
    
    //Getters y setters
    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        if (identificacion>0) {
            this.identificacion = identificacion;
        }
        
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>16 && edad<=130) {
            this.edad = edad;
        }
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura>0) {
            this.altura = altura;
        }
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso>0) {
            this.peso = peso;
        }
        
    }

    public ArrayList<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(ArrayList<Mensaje> mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public ArrayList<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setMensajesRecibidos(ArrayList<Mensaje> mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    @Override
    public String toString() {
        return nombrePersona;//"Persona\n" + "Identificacion=" + identificacion + ", Nombre persona=" + nombrePersona + ", Edad=" + edad + ", Sexo=" + sexo + ", Estado civil=" + estadoCivil + ", Altura=" + altura + ", Peso=" + peso;
    }

}
