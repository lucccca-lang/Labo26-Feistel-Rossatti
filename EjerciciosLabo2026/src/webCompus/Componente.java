package webCompus;

public abstract class Componente {
    private String nombreFabricante;
    private String modelo;
    private float precioVenta;
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

    public Componente(String nombreFabricante, String modelo, float precioVenta, int stock) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.stock = stock;
        this.precioVenta = precioVenta;
    }

    public abstract int EsCpu();
    public abstract int EsDispSalida();
    public abstract int EsDispEntrada();


}
