package webCompus;

public abstract class Dispositivo extends Componente{
    private int cantPuertosValidos;

    public int getCantPuertosValidos() {
        return cantPuertosValidos;
    }
    public void setCantPuertosValidos(int cantPuertosValidos) {
        this.cantPuertosValidos = cantPuertosValidos;
    }

    public Dispositivo(String nombreFabricante, String modelo, float precioVenta, int stock, int cantPuertosValidos) {
        super(nombreFabricante, modelo,  precioVenta, stock);
        this.cantPuertosValidos = cantPuertosValidos;
    }


    @Override
    public int EsCpu() {
        return 0;
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
