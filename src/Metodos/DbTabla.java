/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Datos.Piezas;
import Datos.Tabla;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author raufa
 */
public class DbTabla {
     private DataInputStream input;
    private DataOutputStream out;
    private String path="D:/Java/NetBeans/Tienda/tabla.txt";
    
    public DbTabla(){
         input=null;
        out=null;
    }
    
 public void Salvar(ArrayList<Tabla> lista) throws IOException {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("tabla.txt"))) {
        for (Tabla t : lista) {
            writer.write("Folio: " + t.getFolio() + "\n");
            writer.write("Indice: " + t.getIndice() + "\n");
            writer.write("ID Pieza: " + t.getidPieza() + "\n");
            writer.write("Pieza: " + t.getPieza() + "\n");
            writer.write("Cantidad: " + t.getCantidad() + "\n");
            writer.write("-------------------------------\n");
        }
        System.out.println("Datos guardados correctamente.");
    } catch (IOException e) {
        System.out.println("Error al guardar los datos: " + e.getMessage());
    }
}
 
public void editarTabla(ArrayList<Tabla> rest) {
    File tempFile = new File("tempFile.txt");
    File tablaFile = new File("tabla1.txt");
    File inputFile = new File("tabla.txt");

    if (!inputFile.exists()) {
        System.out.println("El archivo no existe.");
        return;
    }

    try {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        DataOutputStream out = new DataOutputStream(new FileOutputStream(tempFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tablaFile));

        String line;
        HashSet<String> procesados = new HashSet<>(); 
        for ( Tabla t : rest){
            System.out.println("lo que me llega es" + t.getIndice());
        
    }
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Folio:")) {
                String folio = line.substring(7).trim();
                int indice = Integer.parseInt(reader.readLine().substring(8).trim());
                int idPieza = Integer.parseInt(reader.readLine().substring(10).trim());
                String pieza = reader.readLine().substring(7).trim();
                int cantidad = Integer.parseInt(reader.readLine().substring(10).trim());

                reader.readLine(); // Saltar la línea de separación

                boolean actualizado = false;

                for (Tabla rep : rest) {
                    if (rep.getidPieza() == idPieza && rep.getIndice() == indice) {
                        out.writeUTF(rep.getFolio());
                        out.writeInt(rep.getIndice());
                        out.writeInt(rep.getidPieza());
                        out.writeUTF(rep.getPieza());
                        out.writeInt(rep.getCantidad());

                        writer.write("Folio: " + rep.getFolio() + "\n");
                        writer.write("Indice: " + rep.getIndice() + "\n");
                        writer.write("ID Pieza: " + rep.getidPieza() + "\n");
                        writer.write("Pieza: " + rep.getPieza() + "\n");
                        writer.write("Cantidad: " + rep.getCantidad() + "\n");
                        writer.write("-------------------------------\n");

                        procesados.add(rep.getidPieza() + "-" + rep.getIndice()); // Marcar como procesado
                        actualizado = true;
                        break;
                    }
                }

                if (!actualizado) {
                    out.writeUTF(folio);
                    out.writeInt(indice);
                    out.writeInt(idPieza);
                    out.writeUTF(pieza);
                    out.writeInt(cantidad);

                    writer.write("Folio: " + folio + "\n");
                    writer.write("Indice: " + indice + "\n");
                    writer.write("ID Pieza: " + idPieza + "\n");
                    writer.write("Pieza: " + pieza + "\n");
                    writer.write("Cantidad: " + cantidad + "\n");
                    writer.write("-------------------------------\n");

                    procesados.add(idPieza + "-" + indice); // También lo marcamos como procesado
                }
            }
        }

        reader.close();

        // Agregar nuevos registros que no estaban en el archivo original
        for (Tabla rep : rest) {
            String key = rep.getidPieza() + "-" + rep.getIndice();
            if (!procesados.contains(key)) { // Si no fue procesado, es un nuevo registro
                out.writeUTF(rep.getFolio());
                out.writeInt(rep.getIndice());
                out.writeInt(rep.getidPieza());
                out.writeUTF(rep.getPieza());
                out.writeInt(rep.getCantidad());

                writer.write("Folio: " + rep.getFolio() + "\n");
                writer.write("Indice: " + rep.getIndice() + "\n");
                writer.write("ID Pieza: " + rep.getidPieza() + "\n");
                writer.write("Pieza: " + rep.getPieza() + "\n");
                writer.write("Cantidad: " + rep.getCantidad() + "\n");
                writer.write("-------------------------------\n");
            }
        }

        writer.close();
        out.close();

    } catch (IOException ex) {
        System.out.println("Error en edición: " + ex.getMessage());
        return;
    }

    // Reemplazo del archivo original con el actualizado
    if (!inputFile.delete()) {
        System.out.println("Error: No se pudo eliminar el archivo original.");
        return;
    }

    if (!tablaFile.renameTo(inputFile)) {
        System.out.println("Error: No se pudo renombrar el archivo temporal.");
    } else {
        System.out.println("Registro editado correctamente y guardado en tabla.txt.");
    }
}

public void eliminarTabla(Tabla rep) {
    File tempFile = new File("tempFile.txt");
    File tablaFile = new File("tabla1.txt");
    File inputFile = new File("tabla.txt");

    if (!inputFile.exists()) {
        System.out.println("El archivo no existe.");
        return;
    }

    try {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        DataOutputStream out = new DataOutputStream(new FileOutputStream(tempFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tablaFile));

        String line;

        
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Folio:")) {
                String folio = line.substring(7).trim();
                int indice = Integer.parseInt(reader.readLine().substring(8).trim());
                int idPieza = Integer.parseInt(reader.readLine().substring(10).trim());
                String pieza = reader.readLine().substring(7).trim();
                int cantidad = Integer.parseInt(reader.readLine().substring(10).trim());

                reader.readLine();
                System.out.println("lo que me llega a borrar es"+rep.getidPieza()+rep.getIndice() );

          

                    if (rep.getidPieza() == idPieza && rep.getIndice() == indice) {
                 
                        
                     
                    }else {
                            out.writeUTF(folio);
                    out.writeInt(indice);
                    out.writeInt(idPieza);
                    out.writeUTF(pieza);
                    out.writeInt(cantidad);

                    writer.write("Folio: " + folio + "\n");
                    writer.write("Indice: " + indice + "\n");
                    writer.write("ID Pieza: " + idPieza + "\n");
                    writer.write("Pieza: " + pieza + "\n");
                    writer.write("Cantidad: " + cantidad + "\n");
                    writer.write("-------------------------------\n");

                    }
            }
        }

        reader.close();

        writer.close();
        out.close();

    } catch (IOException ex) {
        System.out.println("Error en edición: " + ex.getMessage());
        return;
    }

    // Reemplazo del archivo original con el actualizado
    if (!inputFile.delete()) {
        System.out.println("Error: No se pudo eliminar el archivo original.");
        return;
    }

    if (!tablaFile.renameTo(inputFile)) {
        System.out.println("Error: No se pudo renombrar el archivo temporal.");
    } else {
        System.out.println("Registro editado correctamente y guardado en tabla.txt.");
    }
}

 public ArrayList<Tabla> Cargar(String f) {
    ArrayList<Tabla> lista = new ArrayList<>();
    Tabla tabla = new Tabla();
    try {
        input = new DataInputStream(new FileInputStream(path));
        while (true) {
            try {
                String folio = input.readUTF();
                int indice = input.readInt();
                int idPieza = input.readInt();
                String pieza = input.readUTF();
                int cantidad = input.readInt();
                tabla.setCantidad(cantidad);
                System.out.println(" el foliko es"+folio);
                
                if(folio.equals(f)){
                        tabla.setFolio(folio);
                    tabla.setIndice(indice);
                    tabla.setPieza(pieza);
                    tabla.setidPieza(idPieza);
                }
            

                //Tabla t = new Tabla(folio, indice, idPieza, pieza, cantidad);
                lista.add(tabla);
            } catch (EOFException e) {
                break; 
            }
        }
        
        for (Tabla t : lista){
           System.out.println("lko que hay es "+t.getFolio()+t.getCantidad());
           
       }
        input.close();
        
        System.out.println("Datos cargados correctamente.");
    } catch (FileNotFoundException e) {
        System.out.println("No se encontró el archivo: " + e.getMessage());
    } catch (IOException e) {
        e.printStackTrace();
    }
    return lista;
}

public List<Tabla> cargarDatosDesdeArchivo(String archivo) {
    List<Tabla> lista = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        String line;
        Tabla tabla = null;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Folio:")) {
               
                if (tabla != null) {
                    lista.add(tabla);  
                }
                tabla = new Tabla();
                tabla.setFolio(line.substring(6).trim());  
            } else if (line.startsWith("Indice:")) {
                tabla.setIndice(Integer.parseInt(line.substring(8).trim()));
            } else if (line.startsWith("ID Pieza:")) {
                tabla.setidPieza(Integer.parseInt(line.substring(10).trim()));
            } else if (line.startsWith("Pieza:")) {
                tabla.setPieza(line.substring(6).trim());
            } else if (line.startsWith("Cantidad:")) {
                tabla.setCantidad(Integer.parseInt(line.substring(9).trim()));
            }
        }
        // Agregar la última tabla (en caso de que no se haya agregado aún)
        if (tabla != null) {
            lista.add(tabla);
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    return lista;
}


}

