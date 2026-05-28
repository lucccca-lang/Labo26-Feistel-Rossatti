package webCompus;

public class Componente {
    private String nombreFabricante;
    private String modelo;
    private int precioVenta;
    private int stock;

    public String getNombreFabricante() {
        return nombreFabricante;
    }
    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Componente(String nombreFabricante, String modelo, int stock, int precioVenta) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.stock = stock;
        this.precioVenta = precioVenta;
    }

    public int ActualizarPrecio(int porcentaje){
        porcentaje pre

        return
    }
}
