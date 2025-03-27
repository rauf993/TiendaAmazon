package Metodos;



import Datos.Clientes;
import Datos.Vehiculos;
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
import javax.swing.JTextField;

    
public class DbVehiculos{
    private DataInputStream input;
    private DataOutputStream out;

     private String path="D:/ImportantThings/Repositorios/Repository java/Proyecto1/vehiculos.txt";
    private int maxID;
    private boolean ban=false;
     public DbVehiculos(){
        input=null;
        out=null;
        maxID=0;
    }
     
     public void Salvar(Vehiculos vehiculo) {
    try {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(path, true));
        if (matriculaExiste(vehiculo.getMatricula())) {
            JOptionPane.showMessageDialog(null, "Ya existe un vehículo con esa matrícula. No se puede guardar.");
            out.close(); 
            return;
        }
        out.writeInt(vehiculo.getVehiculoid());
        out.writeUTF(vehiculo.getMatricula());
        out.writeUTF(vehiculo.getMarca());
        out.writeUTF(vehiculo.getModelo());
        out.writeUTF(vehiculo.getFecha());
        out.close(); 

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
     private boolean matriculaExiste(String matricula) throws IOException {
    boolean existe = false;
    DataInputStream in = null;
    try {
        in = new DataInputStream(new FileInputStream(path));
        while (in.available() > 0) {
            int id = in.readInt(); 
            String matriculaActual = in.readUTF();
            if (matriculaActual.equals(matricula)) {
                existe = true;
                break; 
            }
            in.readUTF(); 
            in.readUTF(); 
            in.readUTF(); 
        }
    } finally {
        if (in != null) {
            in.close();
        }
    }
    return existe;
}
    public Vehiculos buscar(Vehiculos vehiculo) throws IOException {
    Vehiculos aux = null;
    try {
        Boolean ban = false;
        input = new DataInputStream(new FileInputStream(path));
        int vehiculoid = 0;
        String matricula = "", modelo = "", marca = "",fecha = "";
        while (!ban) {
            try {
                vehiculoid = input.readInt();
                matricula = input.readUTF();
                modelo = input.readUTF();
                marca = input.readUTF();
                fecha = input.readUTF();
                if (vehiculo.getMatricula().equals(matricula)) {
                    aux = new Vehiculos();
                    aux.setVehiculoid(vehiculoid);
                    aux.setMatricula(matricula);
                    aux.setModelo(modelo);
                    aux.setMarca(marca);
                    aux.setFecha(fecha);
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
     public Vehiculos buscarID(Vehiculos vehiculo) throws IOException {
    Vehiculos aux = null;
    try {
        Boolean ban = false;
        input = new DataInputStream(new FileInputStream(path));
        int vehiculoid = 0;
        String matricula = "", modelo = "", marca = "",fecha = "";
        while (!ban) {
            try {
                vehiculoid = input.readInt();
                matricula = input.readUTF();
                modelo = input.readUTF();
                marca = input.readUTF();
                fecha = input.readUTF();
                if (vehiculo.getVehiculoid()==vehiculoid) {
                    aux = new Vehiculos();
                    aux.setVehiculoid(vehiculoid);
                    aux.setMatricula(matricula);
                    aux.setModelo(modelo);
                    aux.setMarca(marca);
                    aux.setFecha(fecha);
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

    /*
   public void editar(Vehiculos vehiculo) {
    try {
        File inputFile = new File(path);
        File tempFile = new File("tempFile.txt");

        DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(tempFile));

        while (input.available() > 0) {
            int vehiculoid = input.readInt();
            String matricula = input.readUTF();
            String marca = input.readUTF();
            String modelo = input.readUTF();
            String fecha = input.readUTF();
            if (matricula.equals(vehiculo.getMatricula())) {
                output.writeInt(vehiculoid); // Mantener el ID original
                output.writeUTF(vehiculo.getMatricula() != null ? vehiculo.getMatricula() : "");
                output.writeUTF(vehiculo.getMarca() != null ? vehiculo.getMarca() : "");
                output.writeUTF(vehiculo.getModelo() != null ? vehiculo.getModelo() : "");
                output.writeUTF(vehiculo.getFecha() != null ? vehiculo.getFecha() : "");
            } else {
                output.writeInt(vehiculoid);
                output.writeUTF(matricula);
                output.writeUTF(marca);
                output.writeUTF(modelo);
                output.writeUTF(fecha);
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
    */
    
public void editar(Vehiculos vehiculo) {
    try {
        File inputFile = new File(path);
        File tempFile = new File("tempFile.txt");

        DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(tempFile));

        while (input.available() > 0) {
            int vehiculoid = input.readInt();
            String matricula = input.readUTF();
            String marca = input.readUTF();
            String modelo = input.readUTF();
            String fecha = input.readUTF();

            if (matricula.equals(vehiculo.getMatricula())) {
                // Editar solo los campos que no sean nulos
                output.writeInt(vehiculoid);
                output.writeUTF(vehiculo.getMatricula() != null ? vehiculo.getMatricula() : matricula);
                output.writeUTF(vehiculo.getMarca() != null ? vehiculo.getMarca() : marca);
                output.writeUTF(vehiculo.getModelo() != null ? vehiculo.getModelo() : modelo);
                output.writeUTF(vehiculo.getFecha() != null ? vehiculo.getFecha() : fecha);
            } else {
                // Guardar el mismo registro sin cambios
                output.writeInt(vehiculoid);
                output.writeUTF(matricula);
                output.writeUTF(marca);
                output.writeUTF(modelo);
                output.writeUTF(fecha);
            }
        }

        input.close();
        output.close();

        if (!inputFile.delete()) {
            System.out.println("No se pudo eliminar el archivo original.");
        }
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("No se pudo renombrar el archivo.");
        }
    } catch (IOException ex) {
        Logger.getLogger(DbVehiculos.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
    public void remover(Vehiculos vehiculo) throws IOException {
    ArrayList<Vehiculos> list = new ArrayList<>();
    boolean removed = false;
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (true) {
            try {
                Vehiculos aux = new Vehiculos();
                int vehiculoid = input.readInt();
                String matricula = input.readUTF();
                String marca = input.readUTF();
                String modelo = input.readUTF();
                String fecha = input.readUTF();
                aux.setVehiculoid(vehiculoid);
                aux.setMatricula(matricula);
                aux.setMarca(marca);
                aux.setModelo(modelo);
                aux.setFecha(fecha);
                list.add(aux);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
        return; 
    }
    removed = list.removeIf(x -> x.getMatricula().equals(vehiculo.getMatricula()));
    if (removed) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Vehiculos x : list) {
                out.writeInt(x.getVehiculoid());
                out.writeUTF(x.getMatricula());
                out.writeUTF(x.getMarca());
                out.writeUTF(x.getModelo());
                out.writeUTF(x.getFecha());
            }
        }
    }
} 
    
    /*public String comboBox(String ve) throws IOException {
    ArrayList<Vehiculos> list = new ArrayList<>();
    DataInputStream input = null; 
    try {
        input = new DataInputStream(new FileInputStream(path));
        while (true) {
            try {
                Vehiculos vehiculo = new Vehiculos();
                vehiculo.setVehiculoid(input.readInt());
                vehiculo.setMarca(input.readUTF());
                vehiculo.setModelo(input.readUTF());
                vehiculo.setFecha(input.readUTF());
                
                list.add(vehiculo);
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
    for (Vehiculos x : list) {
        if (String.valueOf(x.getVehiculoid()).equals(ve)) {
            return String.valueOf(x.getVehiculoid()); 
        }
    }
    return ""; 
}*/
    public ArrayList<String> comboBox() throws IOException {
    ArrayList<Vehiculos> list = new ArrayList<>();
    ArrayList<String> listId = new ArrayList<>();
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (true) {
            try {
                Vehiculos vehiculo = new Vehiculos();
                vehiculo.setVehiculoid(input.readInt());
                vehiculo.setMatricula(input.readUTF());
                vehiculo.setMarca(input.readUTF());
                vehiculo.setModelo(input.readUTF());
                vehiculo.setFecha(input.readUTF());
                list.add(vehiculo);
            } catch (EOFException e) {
                break;
            }  
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
    }
    
    for (Vehiculos x : list) {
        listId.add(String.valueOf(x.getMatricula()));
    }
    
    return listId;
}

    

 public int getID() {
    try {
        ArrayList<Vehiculos> list = getVehiculos();
        
        if (!list.isEmpty()) {  
            Vehiculos ultimoCliente = list.get(list.size() - 1);
            System.out.println( + ultimoCliente.getVehiculoid());
            
            setMaxID(ultimoCliente.getVehiculoid());  
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
 public ArrayList<Vehiculos> getVehiculos()throws IOException{

        
        ArrayList<Vehiculos> list = new ArrayList<>();
        DataInputStream input = new DataInputStream(new FileInputStream(path));
        
        while(true){
            try{
                Vehiculos aux=new Vehiculos();
                int vehiculoid=input.readInt();
                String Matricula = input.readUTF();
                String Marca =  input.readUTF();
                String Modelo= input.readUTF();
                String Fecha= input.readUTF();
                
                aux.setVehiculoid(vehiculoid);
                aux.setMatricula(Matricula);
               aux.setMarca(Marca);
               aux.setModelo(Modelo);
                aux.setFecha(Fecha);
                list.add(aux);
                
                
                
                
                
            }catch(EOFException e){
                break;
                
            }
        }
        
        return  list;

} 

}


