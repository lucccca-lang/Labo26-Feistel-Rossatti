package negocioJuliMigue;

public abstract class Preparacion {
    private int cantHarina;
    private int cantAzucar;
    private int cantManteca;
    private int cantHuevos;
    private int stock;
    private int precio;

    public int getCantHarina() {
        return cantHarina;
    }
    public void setCantHarina(int cantHarina) {
        this.cantHarina = cantHarina;
    }
    public int getCantAzucar() {
        return cantAzucar;
    }
    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }
    public int getCantManteca() {
        return cantManteca;
    }
    public void setCantManteca(int cantManteca) {
        this.cantManteca = cantManteca;
    }
    public int getCantHuevos() {
        return cantHuevos;
    }
    public void setCantHuevos(int cantHuevos) {
        this.cantHuevos = cantHuevos;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Preparacion(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, int precio) {
        this.cantHarina = cantHarina;
        this.cantAzucar = cantAzucar;
        this.cantManteca = cantManteca;
        this.cantHuevos = cantHuevos;
        this.stock = stock;
        this.precio = precio;
    }

    public abstract String conocerReceta();

    public boolean verificarIngredientes(){
        if (this.cantAzucar > 1 && this.cantHarina >1 && this.cantHuevos >1 && this.cantManteca > 1){
            return true;
        }
        return false;
    }
}
