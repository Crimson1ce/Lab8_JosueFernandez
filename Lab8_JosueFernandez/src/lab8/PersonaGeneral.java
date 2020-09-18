package lab8;

import java.io.Serializable;

public class PersonaGeneral extends Persona implements Serializable{
    private String ocupacion;
    private String horario;
    private int semanasContratado;
    private float sueldo;

    public PersonaGeneral() {
    }

    public PersonaGeneral(String ocupacion, String horario, int semanasContratado, float sueldo, long identificacion, String nombrePersona, int edad, String sexo, String estadoCivil, int altura, int peso) {
        super(identificacion, nombrePersona, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        setSemanasContratado(semanasContratado);
        setSueldo(sueldo);
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanasContratado() {
        return semanasContratado;
    }

    public void setSemanasContratado(int semanasContratado) {
        if (semanasContratado>=0) {
            this.semanasContratado = semanasContratado;
        }
        
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        if (sueldo>=0.0) {
            this.sueldo = sueldo;
        }
        
    }

    @Override
    public String toString() {
        return super.toString();//"\n\tPersona General\n" + "Ocupación=" + ocupacion + ", Horario=" + horario + ", Semanas que lleva contratado=" + semanasContratado + ", Sueldo=" + sueldo;
    }
    
}
