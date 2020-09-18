package lab8;

public class Gerente extends Persona{
    private String usuario;
    private String contraseña;
    private String cargo;

    public Gerente() {
    }

    public Gerente(String usuario, String contraseña, String cargo, long identificacion, String nombrePersona, int edad, String sexo, String estadoCivil, int altura, int peso) {
        super(identificacion, nombrePersona, edad, sexo, estadoCivil, altura, peso);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString();//"\n\tGerente\n" + "Usuario=" + usuario + ", Contraseña=" + contraseña + ", Cargo=" + cargo;
    }
}
