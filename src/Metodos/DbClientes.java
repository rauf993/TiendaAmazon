
package Metodos;

import Datos.Clientes;
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

    
public class DbClientes {
    private DataInputStream input;
    private DataOutputStream out;
    private String path="D:/Java/NetBeans/Tienda/clientes.txt";
     private JComboBox<String> cbIdUsuario;
    private int maxID;
     Boolean ban = false;
     public DbClientes(){
        input=null;
        out=null;
        maxID=0;
    }
     public void Salvar(Clientes cl){
    try {
        out = new DataOutputStream(new FileOutputStream(path, true));
        out.writeInt(cl.getClienteid());
        out.writeUTF(cl.getNombre());
        out.writeUTF(cl.getaPaterno());
        out.writeUTF(cl.getaMaterno());
        out.writeUTF(cl.getRfc());
        out.close(); 
    } catch (IOException ex) {
    }
}
    public Clientes buscar(Clientes client) throws IOException {
    Clientes aux = null;
    try {
        Boolean ban = false;
        input = new DataInputStream(new FileInputStream(path));
        int clienteid = 0;
        String nombre = "", aPaterno = "", aMaterno = "", rfc = "";
        System.out.println( client.getNombre());
        while (!ban) {
            try {
                clienteid = input.readInt();
                nombre = input.readUTF();
                aPaterno = input.readUTF();
                aMaterno = input.readUTF();
                rfc = input.readUTF();
                
                if (client.getNombre().equals(nombre)) {
                    aux = new Clientes();
                    aux.setClienteid(clienteid);
                    aux.setNombre(nombre);
                    aux.setaPaterno(aPaterno);
                    aux.setaMaterno(aMaterno);
                    aux.setRfc(rfc);
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
       public Clientes buscarid(Clientes client) throws IOException {
    Clientes aux = null;
    try {
        Boolean ban = false;
        input = new DataInputStream(new FileInputStream(path));
        int clienteid = 0;
        String nombre = "", aPaterno = "", aMaterno = "", rfc = "";
        System.out.println( client.getNombre());
        while (!ban) {
            try {
                clienteid = input.readInt();
                nombre = input.readUTF();
                aPaterno = input.readUTF();
                aMaterno = input.readUTF();
                rfc = input.readUTF();
                
         
               if ( client.getClienteid() == clienteid) {
                aux = new Clientes();
                aux.setClienteid(clienteid);
                aux.setNombre(nombre);
                aux.setaPaterno(aPaterno);
                aux.setaMaterno(aMaterno);
                aux.setRfc(rfc);
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

   public void editar(Clientes client) {
    try {
        File inputFile = new File(path);
        File tempFile = new File("tempFile.txt");

        DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(tempFile));

        while (input.available() > 0) {
            int clienteid = input.readInt();
            String nombre = input.readUTF();
            String aPaterno = input.readUTF();
            String aMaterno = input.readUTF();
            String rfc = input.readUTF();
            if (nombre.equals(client.getNombre())) {
                output.writeInt(clienteid); 
                output.writeUTF(client.getNombre() != null ? client.getNombre() : "");
                output.writeUTF(client.getaPaterno() != null ? client.getaPaterno() : "");
                output.writeUTF(client.getaMaterno() != null ? client.getaMaterno() : "");
                output.writeUTF(client.getRfc() != null ? client.getRfc() : "");
            } else {
                output.writeInt(clienteid);
                output.writeUTF(nombre);
                output.writeUTF(aPaterno);
                output.writeUTF(aMaterno);
                output.writeUTF(rfc);
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
    
    public void remover(Clientes client) throws IOException {
    ArrayList<Clientes> list = new ArrayList<>();
    boolean removed = false;
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (true) {
            try {
                Clientes aux = new Clientes();
                int clienteid = input.readInt();
                String nombre = input.readUTF();
                String aPaterno = input.readUTF();
                String aMaterno = input.readUTF();
                String rfc = input.readUTF();
                aux.setClienteid(clienteid);
                aux.setNombre(nombre);
                aux.setaPaterno(aPaterno);
                aux.setaMaterno(aMaterno);
                aux.setRfc(rfc);
                list.add(aux);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
        return; 
    }
    removed = list.removeIf(x -> x.getNombre().equals(client.getNombre()));
    if (removed) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Clientes x : list) {
                out.writeInt(x.getClienteid());
                out.writeUTF(x.getNombre());
                out.writeUTF(x.getaPaterno());
                out.writeUTF(x.getaMaterno());
                out.writeUTF(x.getRfc());
            }
        }
    }
} 
   public String comboBox(String cl) throws IOException {
    ArrayList<Clientes> list = new ArrayList<>();
    boolean ban = false; 
    DataInputStream input = null; 
    try {
        input = new DataInputStream(new FileInputStream(path));
        int usuarioid=0;
        String nombre="", aPaterno="", aMaterno="", rfc="";
        
        while (true) {
            try {
                Clientes client = new Clientes();
                usuarioid = input.readInt();
                nombre = input.readUTF();
                aPaterno = input.readUTF();
                aMaterno = input.readUTF();
                rfc = input.readUTF();
                client.setUsuarioid(usuarioid);
                client.setNombre(nombre);
                client.setaPaterno(aPaterno);
                client.setaMaterno(aMaterno);
                client.setRfc(rfc);

                list.add(client);
            } catch (EOFException ex) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
    } finally {
        if (input != null) {
            input.close();
        }
    }
    for (Clientes x : list) {
        if (x.getNombre().equals(cl)) {
            return String.valueOf(x.getNombre()); 
        }
        
    }
    return ""; 
}

   public int getID() {
    try {
        ArrayList<Clientes> list = getClientes();
        
        if (!list.isEmpty()) {  
            Clientes ultimoCliente = list.get(list.size() - 1);
            System.out.println( + ultimoCliente.getClienteid());
            
            setMaxID(ultimoCliente.getClienteid());  
            maxID++; 
        } else {
            System.out.println("La lista está vacía.");
            maxID = 1;
        }

    } catch (IOException e) {
        System.out.println("Error al leer clientes: " + e.getMessage());
        maxID = 1; 
    }

    return maxID;
}

public void setMaxID(int clienteid) {
    this.maxID = clienteid;
}

    
    public ArrayList<Clientes> getClientes ()throws IOException{

        
        ArrayList<Clientes> list = new ArrayList<>();
        DataInputStream input = new DataInputStream(new FileInputStream(path));
        
        while(true){
            try{
                Clientes aux=new Clientes();
                int clienteid=input.readInt();
                String nombre = input.readUTF();
                String ApellidoP =  input.readUTF();
                String ApellidoM= input.readUTF();
                String rfc= input.readUTF();
                
                aux.setClienteid(clienteid);
                aux.setNombre(nombre);
                aux.setaPaterno(ApellidoP);
                aux.setaMaterno(ApellidoM);
                aux.setRfc(rfc);
                list.add(aux);
                
                
                
                
                
            }catch(EOFException e){
                break;
                
            }
        }
        
        return  list;

} 

}

