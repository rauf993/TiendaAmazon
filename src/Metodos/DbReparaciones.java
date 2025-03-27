package Metodos;


/*
import Objetos.Piezas;
import Objetos.Reparaciones;
*/
import Datos.Reparaciones;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DbReparaciones {
    private DataInputStream input;
    private DataOutputStream out;
    private String path="D:/Java/NetBeans/Tienda/reparaciones.txt";
    private int maxID;
    
     public DbReparaciones(){
        input=null;
        out=null;
        maxID=0;
    }
     
    public void Salvar(Reparaciones rep){
    try {
        out = new DataOutputStream(new FileOutputStream(path, true));
        out.writeInt(rep.getReparacionid());
        out.writeInt(rep.getCantidad());
        out.writeUTF(rep.getFalla());
        out.writeUTF(rep.getFechaen());
        out.writeUTF(rep.getFechasa());
        
        out.close(); 
    } catch (IOException ex) {
    }
}

    public Reparaciones buscar(Reparaciones rep) throws IOException {
    Reparaciones aux = null;
    Boolean ban = false;
    try {
        input = new DataInputStream(new FileInputStream(path));
        int reparacionid = 0,cantidad=0;
        String falla="",fechaen="",fechasa="";
        while (!ban) {
            try {
                reparacionid = input.readInt();
                cantidad = input.readInt();
                falla = input.readUTF();
                fechaen = input.readUTF();
                fechasa = input.readUTF();
                if (reparacionid == rep.getReparacionid()) {
                    aux = new Reparaciones();
                    aux.setReparacionid(reparacionid);
                    aux.setCantidad(cantidad);
                    aux.setFalla(falla);
                    aux.setFechaen(fechaen);
                    aux.setFechasa(fechasa);
                    ban = true; 
                }
            } catch (EOFException ex) {
                break;
            }
        }
        input.close();
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
    }
    return aux;
}

   public void editar(Reparaciones rep) {
    try {
        File inputFile = new File(path);
        File tempFile = new File("tempFile.txt");

        DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(tempFile));

        while (input.available() > 0) {
            int reparacionid = input.readInt();
            int cantidad = input.readInt();
            String falla= input.readUTF();
            String fechaen = input.readUTF();
            String fechasa = input.readUTF();
            if(rep.getReparacionid()==reparacionid) {
                output.writeInt(reparacionid);
                output.writeInt(cantidad);
                output.writeUTF(rep.getFalla()!= null ? rep.getFalla() : "");
                output.writeUTF(rep.getFechaen() != null ? rep.getFechaen() : "");
                output.writeUTF(rep.getFechasa() != null ? rep.getFechasa() : "");
            } else {
                output.writeInt(reparacionid);
                output.writeInt(cantidad);
                output.writeUTF(falla);
                output.writeUTF(fechaen);
                output.writeUTF(fechasa);
            }
        }

        input.close();
        output.close();

        if (!inputFile.delete()) {
            System.out.println("No se pudo eliminar el archivo");
        }
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("No se pudo renombrar el archivo");
        }
    } catch (IOException ex) {
        Logger.getLogger(DbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public void remover(Reparaciones rep) throws IOException {
    ArrayList<Reparaciones> list = new ArrayList<>();
    boolean removed = false;
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (true) {
            try {
                Reparaciones aux = new Reparaciones();
                int reparacionid = input.readInt();
                int cantidad = input.readInt();
                String falla = input.readUTF();
                String fechaen = input.readUTF();
                String fechasa = input.readUTF();
                aux.setReparacionid(reparacionid);
                aux.setCantidad(cantidad);
                aux.setFalla(falla);
                aux.setFechaen(fechaen);
                aux.setFechasa(fechasa);
                list.add(aux);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
        return; 
    }
    removed = list.removeIf(x -> x.getReparacionid()==rep.getReparacionid());
    if (removed) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Reparaciones x : list) {
                out.writeInt(x.getReparacionid());
                out.writeInt(x.getCantidad());
                out.writeUTF(x.getFalla());
                out.writeUTF(x.getFechaen());
                out.writeUTF(x.getFechasa());
            }
        }
    }
} 
    
  
    public int aumentarID(){
        maxID++;
        return maxID;
    }
    public void setMaxID(int reparacionid) {
        maxID = reparacionid; 
    }  
}
