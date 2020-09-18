package lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminPersonas {
    
    private File archivo;
    private ArrayList<Persona> personas;

    public AdminPersonas() {
        archivo = new File("./Personas.per");
        personas = new ArrayList<>();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "AdminPersonas{" + "archivo=" + archivo + ", personas=" + personas + '}';
    }
    
    public void cargarPersonas(){
        FileInputStream fi;
        ObjectInputStream oi;
        if (archivo.exists()) {
            try {
                
                fi = new FileInputStream(archivo);
                oi = new ObjectInputStream(fi);
                Persona p;
                
                try {
                    while( (p=(Persona)oi.readObject()) != null ){
                        personas.add(p);
                    }
                } catch (EOFException e) {
                } catch (Exception e){
                    e.printStackTrace();
                }
                
                oi.close();
                fi.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void escribirPersonas(){
        FileOutputStream fo;
        ObjectOutputStream oo;
        try {
            fo = new FileOutputStream(archivo, false);
            oo = new ObjectOutputStream(fo);
            
            for (Persona persona : personas) {
                oo.writeObject(oo);
            }
            
            oo.close();
            fo.close();
            
        } catch (Exception e) {
        }
    }
    
}
