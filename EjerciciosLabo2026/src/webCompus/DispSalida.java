package webCompus;

public class DispSalida extends Dispositivo{

    public DispSalida(String nombreFabricante, String modelo, int stock, float precioVenta, int cantPuertosValidos) {
        super(nombreFabricante, modelo, precioVenta, stock, cantPuertosValidos);
    }

    @Override
    public int EsDispSalida() {
        return 1;
    }
}
