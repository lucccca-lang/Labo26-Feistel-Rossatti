package negocioJuliMigue;

public class Cookie extends Preparacion implements Vendible{
    private int cantBicarbonato;
    private Topping topping;

    public int getCantBicarbonato() {
        return cantBicarbonato;
    }
    public void setCantBicarbonato(int cantBicarbonato) {
        this.cantBicarbonato = cantBicarbonato;
    }
    public Topping getTopping() {
        return topping;
    }
    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Cookie(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, int precio, int cantBicarbonato, Topping topping) {
        super(cantHarina, cantAzucar, cantManteca, cantHuevos, stock, precio);
        this.cantBicarbonato = cantBicarbonato;
        this.topping = topping;
    }

    @Override
    public String conocerReceta() {
        return "Empeza partiendo el chocolate";
    }

    @Override
    public boolean actualizarStock(int cantRequerida){
        try {
            if (this.getStock() < cantRequerida) {
                throw new SinStockException("No hay stock suficiente de cookies");
            }
            System.out.println("Stock suficiente de cookies");
            return true;
        }
        catch (SinStockException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String descripcionVenta() {
        return "Animate a probar las mejores cookies del mercado";
    }

    @Override
    public int calcularPrecio(int cantRequerida) {
        System.out.println("El precio de la cookie es de " + this.getPrecio() + " y del total de la compra es de ");
        return cantRequerida * this.getPrecio();
    }

    @Override
    public void vender(int cantRequerida) {
        if (this.actualizarStock(cantRequerida)) {
            System.out.println("Las ganancias son de " + this.calcularPrecio(cantRequerida));
        }
    }
}
