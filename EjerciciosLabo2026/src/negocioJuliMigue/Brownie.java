package negocioJuliMigue;

public class Brownie extends Preparacion implements Vendible{
    private int cantChocolate;

    public int getCantChocolate() {
        return cantChocolate;
    }
    public void setCantChocolate(int cantChocolate) {
        this.cantChocolate = cantChocolate;
    }

    public Brownie(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, int precio, int cantChocolate) {
        super(cantHarina, cantAzucar, cantManteca, cantHuevos, stock, precio);
        this.cantChocolate = cantChocolate;
    }

    @Override
    public String conocerReceta() {
        return "Derreti la manteca";
    }


    @Override
    public boolean actualizarStock(int cantRequerida){
        try {
            if (this.getStock() < cantRequerida) {
                throw new SinStockException("No hay stock suficiente de brownies");
            }
            System.out.println("Stock suficiente de brownies");
            return true;
        }
        catch (SinStockException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    @Override
    public String descripcionVenta() {
        return "Brownies bien humedos";
    }

    @Override
    public int calcularPrecio(int cantRequerida) {
        System.out.println("El precio del brownie es de " + this.getPrecio() + " y del total de la compra es de ");
        return cantRequerida * this.getPrecio();
    }

    @Override
    public void vender(int cantRequerida) {
        if (this.actualizarStock(cantRequerida)) {
            System.out.println("Las ganancias son de " + this.calcularPrecio(cantRequerida));
        }
    }


}
