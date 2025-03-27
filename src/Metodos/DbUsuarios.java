
package Metodos;

import Datos.Usuarios;
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

public class DbUsuarios {
    private DataInputStream input;
    private DataOutputStream out;
    private String path="D:/taller_mecanico/usuarios.txt";
    private int maxID;
    Boolean ban = false;
    public DbUsuarios(){
        input=null;
        out=null;
        maxID=0;
    }
    
    public void salvar(Usuarios us){
    try {
        out = new DataOutputStream(new FileOutputStream(path, true));
        out.writeInt(us.getUsuarioid());
        out.writeUTF(us.getNombre());
        out.writeUTF(us.getaPaterno());
        out.writeUTF(us.getaMaterno());
        out.writeUTF(us.getTelefono());
        out.writeUTF(us.getDireccion());
        out.writeUTF(us.getUsername());
        out.writeUTF(us.getPassword());
        out.writeUTF(us.getPerfil());
        out.close(); 
    } catch (IOException ex) {
    }
}
    public Usuarios buscar(Usuarios user) throws IOException {
    Usuarios aux = null;
    try {
        Boolean ban = false;
        input = new DataInputStream(new FileInputStream(path));
        int usuarioid=0;
        String nombre="",aPaterno="",aMaterno="",telefono="",direccion="";
        String username="",password="",perfil="";
        while (!ban) {
            try {
                usuarioid = input.readInt();
                nombre = input.readUTF();
                aPaterno = input.readUTF();
                aMaterno = input.readUTF();
                telefono = input.readUTF();
                direccion = input.readUTF();
                username = input.readUTF();
                password = input.readUTF();
                perfil = input.readUTF();
                if (user.getNombre().equals(nombre)) {
                    aux = new Usuarios();
                    aux.setUsuarioid(usuarioid);
                    aux.setNombre(nombre);
                    aux.setaPaterno(aPaterno);
                    aux.setaMaterno(aMaterno);
                    aux.setTelefono(telefono);
                    aux.setDireccion(direccion);
                    aux.setUsername(username);
                    aux.setPassword(password);
                    aux.setPerfil(perfil);
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
    
    public void editar(Usuarios user) {
    try {
        File inputFile = new File(path);
        File tempFile = new File("tempFile.txt");
        DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(tempFile));
        while (input.available() > 0) {
            int usuarioid = input.readInt();
            String nombre = input.readUTF();
            String aPaterno = input.readUTF();
            String aMaterno = input.readUTF();
            String telefono = input.readUTF();
            String direccion = input.readUTF();
            String username = input.readUTF();
            String password = input.readUTF();
            String perfil = input.readUTF();

            if (nombre.equals(user.getNombre())) {
                output.writeInt(usuarioid); // Mantener el ID original
                output.writeUTF(user.getNombre() != null ? user.getNombre() : "");
                output.writeUTF(user.getaPaterno() != null ? user.getaPaterno() : "");
                output.writeUTF(user.getaMaterno() != null ? user.getaMaterno() : "");
                output.writeUTF(user.getTelefono() != null ? user.getTelefono() : "");
                output.writeUTF(user.getDireccion() != null ? user.getDireccion() : "");
                output.writeUTF(user.getUsername() != null ? user.getUsername() : "");
                output.writeUTF(user.getPassword() != null ? user.getPassword() : "");
                output.writeUTF(user.getPerfil() != null ? user.getPerfil() : "");
            } else {
                output.writeInt(usuarioid);
                output.writeUTF(nombre);
                output.writeUTF(aPaterno);
                output.writeUTF(aMaterno);
                output.writeUTF(telefono);
                output.writeUTF(direccion);
                output.writeUTF(username);
                output.writeUTF(password);
                output.writeUTF(perfil);
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
    public void remover(Usuarios user) throws IOException {
    ArrayList<Usuarios> list = new ArrayList<>();
    boolean removed = false;
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (true) {
            try {
                Usuarios aux = new Usuarios();
                int usuarioid = input.readInt();
                String nombre = input.readUTF();
                String aPaterno = input.readUTF();
                String aMaterno = input.readUTF();
                String telefono = input.readUTF();
                String direccion = input.readUTF();
                String username = input.readUTF();
                String password = input.readUTF();
                String perfil = input.readUTF();
                aux.setUsuarioid(usuarioid);
                aux.setNombre(nombre);
                aux.setaPaterno(aPaterno);
                aux.setaMaterno(aMaterno);
                aux.setTelefono(telefono);
                aux.setDireccion(direccion);
                aux.setUsername(username);
                aux.setPassword(password);
                aux.setPerfil(perfil);
                list.add(aux);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
        return; 
    }
    removed = list.removeIf(x -> x.getNombre().equals(user.getNombre()));
    if (removed) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Usuarios x : list) {
                out.writeInt(x.getUsuarioid());
                out.writeUTF(x.getNombre());
                out.writeUTF(x.getaPaterno());
                out.writeUTF(x.getaMaterno());
                out.writeUTF(x.getTelefono());
                out.writeUTF(x.getDireccion());
                out.writeUTF(x.getUsername());
                out.writeUTF(x.getPassword());
                out.writeUTF(x.getPerfil());
            }
        }
    }
}
    public String autenticar(String nombreIngresado, String passwordIngresada) throws IOException {
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (input.available() > 0) {
            try {
                int usuarioid = input.readInt();  
                String nombre = input.readUTF();  
                String aPaterno = input.readUTF(); 
                String aMaterno = input.readUTF();
                String telefono = input.readUTF(); 
                String direccion = input.readUTF();
                String usuarioGuardado = input.readUTF();
                String passwordGuardada = input.readUTF(); 
                String perfil = input.readUTF(); 
                if (nombre.equals(nombreIngresado) && passwordGuardada.equals(passwordIngresada)) {
                    return perfil; 
                }
            } catch (EOFException e) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println("Archivo no encontrado: " + ex.getMessage());
        ex.printStackTrace();
    } catch (IOException ex) {
        System.err.println("Error de lectura: " + ex.getMessage());
        ex.printStackTrace();
    }
    return null; 
}
    public String comboBox(String us) throws IOException {
    ArrayList<Usuarios> list = new ArrayList<>();
    boolean ban = false; 
    DataInputStream input = null; 
    try {
        input = new DataInputStream(new FileInputStream(path));
        int usuarioid;
        String nombre, aPaterno, aMaterno, telefono, direccion;
        String username, password, perfil;
        
        while (true) {
            try {
                Usuarios user = new Usuarios();
                usuarioid = input.readInt();
                nombre = input.readUTF();
                aPaterno = input.readUTF();
                aMaterno = input.readUTF();
                telefono = input.readUTF();
                direccion = input.readUTF();
                username = input.readUTF();
                password = input.readUTF();
                perfil = input.readUTF();
                user.setUsuarioid(usuarioid);
                user.setNombre(nombre);
                user.setaPaterno(aPaterno);
                user.setaMaterno(aMaterno);
                user.setTelefono(telefono);
                user.setDireccion(direccion);
                user.setUsername(username);
                user.setPassword(password);
                user.setPerfil(perfil);

                list.add(user);
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
    for (Usuarios x : list) {
        if (x.getNombre().equals(us)) {
            return String.valueOf(x.getUsuarioid()); 
        }
    }
    return ""; 
}

    public int aumentarID(){
        maxID++;
        return maxID;
    }
    public void setMaxID(int usuarioid) {
        maxID = usuarioid; // Establece un ID máximo desde los datos existentes
    }

}
