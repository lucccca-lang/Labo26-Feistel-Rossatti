package webCompus;

public class Cpu extends Hardware{


    public Cpu(String nombreFabricante, String modelo, int precioVenta, int stock) {
        super(nombreFabricante, modelo, precioVenta, stock);
    }

    @Override
    public int EsCpu() {
        return 1;
    }
}
