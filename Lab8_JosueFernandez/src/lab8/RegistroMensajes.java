package lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RegistroMensajes {
    
    private File archivo;
    private ArrayList<Mensaje> mensajes;

    public RegistroMensajes() {
        archivo = new File("./Mensajes.men");
        mensajes = new ArrayList<>();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "RegistroMensajes{" + "archivo=" + archivo + ", mensajes=" + mensajes + '}';
    }
    public void cargarMensajes(){
        FileInputStream fi;
        ObjectInputStream oi;
        if (archivo.exists()) {
            try {
                
                fi = new FileInputStream(archivo);
                oi = new ObjectInputStream(fi);
                Mensaje m;
                
                try {
                    while( (m=(Mensaje)oi.readObject()) != null ){
                        mensajes.add(m);
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
    
    public void escribirMensajes(){
        FileOutputStream fo;
        ObjectOutputStream oo;
        try {
            fo = new FileOutputStream(archivo, false);
            oo = new ObjectOutputStream(fo);
            
            for (Mensaje mensaje : mensajes) {
                oo.writeObject(mensaje);
            }
            
            oo.close();
            fo.close();
            
        } catch (Exception e) {
        }
    }
    
}
