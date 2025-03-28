/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author raufa
 */
public class Tabla {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    private String Folio;
    private int indice ;
    private int idPieza;
    private String Pieza;
    private int Cantidad;

    public void setFolio(String Folio){
        this.Folio=Folio;
    }
    public String getFolio(){
        
        return this.Folio;
    }
     public void setIndice(int Indice){
        this.indice=Indice;
    }
    public int getIndice(){
        
        return this.indice;
    }
     public void setidPieza(int idPieza){
        this.idPieza=idPieza;
    }
    public int getidPieza(){
        
        return this.idPieza;
    }
        
    public void setPieza(String Pieza){
        this.Pieza=Pieza;
    }
    public String getPieza(){
        
        return this.Pieza;
    }
    
    public void setCantidad(int cantidad){
        this.Cantidad=cantidad;
    }
    public int getCantidad(){
        
        return this.Cantidad;
    }
 
    
    
    
}

    
