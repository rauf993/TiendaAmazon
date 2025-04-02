package Metodos;



import Datos.Piezas;
/*
import Objetos.Clientes;
import Objetos.Piezas;
import Objetos.Usuarios;
import Objetos.Vehiculos;
*/
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

public class DbPiezas {
    private DataInputStream input;
    private DataOutputStream out;
    private String path="D:/Java/NetBeans/Tienda/piezas.txt";
    private int maxID;
    
     public DbPiezas(){
        input=null;
        out=null;
        maxID=0;
    }
     
     public Piezas Salvar(Piezas piezas) throws IOException {
    Piezas aux = null;
    ArrayList<Piezas> listaPiezas = new ArrayList<>();
    boolean ban = false;
    try {
        input = new DataInputStream(new FileInputStream(path));
        int piezaid;
        String nombre, stock;
        while (true) {
            try {
                piezaid = input.readInt();
                nombre = input.readUTF();
                stock = input.readUTF();
                if (piezas.getNombre().equals(nombre)) {
                    int stockActual = Integer.parseInt(stock);
                    int stockNuevo = Integer.parseInt(piezas.getStock());
                    int totalStock = stockActual + stockNuevo;
                    aux = new Piezas();
                    aux.setPiezaid(piezaid);
                    aux.setNombre(nombre);
                    aux.setStock(String.valueOf(totalStock));
                    listaPiezas.add(aux);
                    ban = true;
                } else {
                    Piezas p = new Piezas();
                    p.setPiezaid(piezaid);
                    p.setNombre(nombre);
                    p.setStock(stock);
                    listaPiezas.add(p);
                }

            } catch (EOFException ex) {
                break; 
            }
        }
        input.close();
        if (!ban) {
            listaPiezas.add(piezas);
        }
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Piezas p : listaPiezas) {
                out.writeInt(p.getPiezaid());
                out.writeUTF(p.getNombre());
                out.writeUTF(p.getStock());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo.");
        }

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
    }

    return aux; 
}
     public Piezas disminuirStock(String nombrePieza, int cantidadDisminuir) throws IOException {
    Piezas aux = null;
    ArrayList<Piezas> listaPiezas = new ArrayList<>();
    boolean piezaEncontrada = false;
    try {
        input = new DataInputStream(new FileInputStream(path));
        int piezaid;
        String nombre, stock;

        while (true) {
            try {
                piezaid = input.readInt();
                nombre = input.readUTF();
                stock = input.readUTF();
                if (nombrePieza.equals(nombre)) {
                    int stockActual = Integer.parseInt(stock);
                    if (cantidadDisminuir > stockActual) {
                        JOptionPane.showMessageDialog(null, "La cantidad solicitada supera el stock disponible.");
                        return null;
                    }
                    int stockRestante = stockActual - cantidadDisminuir;
                    aux = new Piezas();
                    aux.setPiezaid(piezaid);
                    aux.setNombre(nombre);
                    aux.setStock(String.valueOf(stockRestante));
                    listaPiezas.add(aux);
                    piezaEncontrada = true;
                } else {
                    Piezas p = new Piezas();
                    p.setPiezaid(piezaid);
                    p.setNombre(nombre);
                    p.setStock(stock);
                    listaPiezas.add(p);
                }

            } catch (EOFException ex) {
                break;
            }
        }
        input.close();
        if (!piezaEncontrada) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada.");
            return null;
        }
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Piezas p : listaPiezas) {
                out.writeInt(p.getPiezaid());
                out.writeUTF(p.getNombre());
                out.writeUTF(p.getStock());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo.");
        }

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
    }

    return aux;
}
       public Piezas aumentarStock(String nombrePieza, int cantidadDisminuir) throws IOException {
    Piezas aux = null;
    ArrayList<Piezas> listaPiezas = new ArrayList<>();
    boolean piezaEncontrada = false;
    try {
        input = new DataInputStream(new FileInputStream(path));
        int piezaid;
        String nombre, stock;

        while (true) {
            try {
                piezaid = input.readInt();
                nombre = input.readUTF();
                stock = input.readUTF();
                if (nombrePieza.equals(nombre)) {
                    int stockActual = Integer.parseInt(stock);
                    if (cantidadDisminuir > stockActual) {
                        JOptionPane.showMessageDialog(null, "La cantidad solicitada supera el stock disponible.");
                        return null;
                    }
                    int stockRestante = stockActual + cantidadDisminuir;
                    aux = new Piezas();
                    aux.setPiezaid(piezaid);
                    aux.setNombre(nombre);
                    aux.setStock(String.valueOf(stockRestante));
                    listaPiezas.add(aux);
                    piezaEncontrada = true;
                } else {
                    Piezas p = new Piezas();
                    p.setPiezaid(piezaid);
                    p.setNombre(nombre);
                    p.setStock(stock);
                    listaPiezas.add(p);
                }

            } catch (EOFException ex) {
                break;
            }
        }
        input.close();
        if (!piezaEncontrada) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada.");
            return null;
        }
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Piezas p : listaPiezas) {
                out.writeInt(p.getPiezaid());
                out.writeUTF(p.getNombre());
                out.writeUTF(p.getStock());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo.");
        }

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Archivo no encontrado.");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
    }

    return aux;
}
     
    public Piezas buscar(Piezas piezas) throws IOException {
    Piezas aux = null;
    try {
        Boolean ban = false;
        input = new DataInputStream(new FileInputStream(path));
        int piezaid = 0;
        String nombre = "", stock = "";
        while (!ban) {
            try {
                piezaid = input.readInt();
                nombre = input.readUTF();
                stock = input.readUTF();
                if (piezaid == piezas.getPiezaid()) {
                    aux = new Piezas();
                    aux.setPiezaid(piezaid);
                    aux.setNombre(nombre);
                    aux.setStock(stock);
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
    
   public void editar(Piezas piezas) {
    try {
        File inputFile = new File(path);
        File tempFile = new File("tempFile.txt");

        DataInputStream input = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream output = new DataOutputStream(new FileOutputStream(tempFile));

        while (input.available() > 0) {
            int piezaid = input.readInt();
            String nombre= input.readUTF();
            String stock = input.readUTF();
            if(piezas.getPiezaid()==piezaid) {
                output.writeInt(piezaid);
                output.writeUTF(piezas.getNombre() != null ? piezas.getNombre() : "");
                output.writeUTF(piezas.getStock() != null ? piezas.getStock() : "");
            } else {
                output.writeInt(piezaid);
                output.writeUTF(nombre);
                output.writeUTF(stock);
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
    
    public void remover(Piezas piezas) throws IOException {
    ArrayList<Piezas> list = new ArrayList<>();
    boolean removed = false;
    try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
        while (true) {
            try {
                Piezas aux = new Piezas();
                int piezaid = input.readInt();
                String nombre = input.readUTF();
                String stock = input.readUTF();
                aux.setPiezaid(piezaid);
                aux.setNombre(nombre);
                aux.setStock(stock);
                list.add(aux);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (FileNotFoundException ex) {
        System.out.println("Archivo no encontrado: " + ex.getMessage());
        return; 
    }
    removed = list.removeIf(x -> x.getPiezaid()==piezas.getPiezaid());
    if (removed) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            for (Piezas x : list) {
                out.writeInt(x.getPiezaid());
                out.writeUTF(x.getNombre());
                out.writeUTF(x.getStock());
            }
        }
    }
} 
    public ArrayList<String> comboBox() throws IOException {
    ArrayList<Piezas> list = new ArrayList<>();
    
     ArrayList<String> listNombre = new ArrayList<>();
    boolean ban = false; 
    DataInputStream input = null; 
    try {
        input = new DataInputStream(new FileInputStream(path));
        int piezasid=0;
        String nombre="",stock="";
        while (true) {
            try {
                Piezas piezas = new Piezas();
                piezasid = input.readInt();
                nombre = input.readUTF();
                stock= input.readUTF();
                piezas.setPiezaid(piezasid);
                piezas.setNombre(nombre);
                piezas.setStock(stock);
                list.add(piezas);
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
    for (Piezas x : list) {
             listNombre.add(String.valueOf(x.getNombre())); 
    }
    return listNombre; 
}
    public Piezas buscarPiezaPorNombre(String nombre) throws IOException {
    ArrayList<Piezas> list = new ArrayList<>();
    DataInputStream input = null;
    try {
        input = new DataInputStream(new FileInputStream(path));
        int piezasid;
        String nombrePieza, stock;
        while (true) {
            try {
                Piezas pieza = new Piezas();
                piezasid = input.readInt();
                nombrePieza = input.readUTF();
                stock = input.readUTF();

                pieza.setPiezaid(piezasid);
                pieza.setNombre(nombrePieza);
                pieza.setStock(stock);

                list.add(pieza);
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
    for (Piezas pieza : list) {
        if (pieza.getNombre().equals(nombre)) {
            return pieza; 
        }
    }
    return null;
}

    public int aumentarID(){
        maxID++;
        return maxID;
    }
    public void setMaxID(int piezaid) {
        maxID = piezaid; 
    }  
}
