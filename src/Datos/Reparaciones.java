package Datos;



public class Reparaciones {
    public int reparacionid;
    private int cantidad;
    private int vehiculoid;
    private String falla;
    private String fechaen;
    private String fechasa;
    
    public int getReparacionid() {
        return reparacionid;
    }

    public void setReparacionid(int reparacionid) {
        this.reparacionid = reparacionid;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidadpi) {
        this.cantidad = cantidadpi;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }

    public String getFechaen() {
        return fechaen;
    }

    public void setFechaen(String fechaen) {
        this.fechaen = fechaen;
    }

    public String getFechasa() {
        return fechasa;
    }

    public void setFechasa(String fechasa) {
        this.fechasa = fechasa;
    }

    public int getVehiculoid() {
        return vehiculoid;
    }

    public void setVehiculoid(int vehiculoid) {
        this.vehiculoid = vehiculoid;
    }
    
}