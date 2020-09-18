package lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminArticulos {
    
    private File archivo;
    private ArrayList<Articulo> articulos;

    public AdminArticulos() {
        archivo = new File("./Articulos.art");
        articulos = new ArrayList<>();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "AdminArticulos{" + "archivo=" + archivo + ", articulos=" + articulos + '}';
    }
    
    public void cargarArticulos(){
        FileInputStream fi;
        ObjectInputStream oi;
        if (archivo.exists()) {
            try {
                
                fi = new FileInputStream(archivo);
                oi = new ObjectInputStream(fi);
                Articulo a;
                
                try {
                    while( (a=(Articulo)oi.readObject()) != null ){
                        articulos.add(a);
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
    
    public void escribirArticulos(){
        FileOutputStream fo;
        ObjectOutputStream oo;
        try {
            fo = new FileOutputStream(archivo, false);
            oo = new ObjectOutputStream(fo);
            
            for (Articulo articulo : articulos) {
                oo.writeObject(articulo);
            }
            
            oo.close();
            fo.close();
            
        } catch (Exception e) {
        }
    }
    
}
