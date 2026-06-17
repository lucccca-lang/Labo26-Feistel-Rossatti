package webCompus;

public class Cpu extends Componente{


    public Cpu(String nombreFabricante, String modelo, float precioVenta, int stock) {
        super(nombreFabricante, modelo, precioVenta, stock);
    }

    @Override
    public int EsCpu() {
        return 1;
    }

    @Override
    public int EsDispSalida() {
        return 0;
    }

    @Override
    public int EsDispEntrada() {
        return 0;
    }
}
