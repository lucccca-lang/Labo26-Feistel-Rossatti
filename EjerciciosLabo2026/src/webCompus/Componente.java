package webCompus;

public class Componente {
    private String nombreFabricante;
    private String modelo;
    private float precioVenta;
    private float stock;

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
    public float getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public Componente(String nombreFabricante, String modelo, int stock, float precioVenta) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.stock = stock;
        this.precioVenta = precioVenta;
    }

    public int EsCpu(){
        return 0;
    }
    public int EsDispSalida(){
        return 0;
    }
    public int EsDispEntrada(){
        return 0;
    }


}
