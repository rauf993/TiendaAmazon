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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

