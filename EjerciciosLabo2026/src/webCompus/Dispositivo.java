package webCompus;

public class Dispositivo extends Componente{
    private int cantPuertosValidos;

    public int getCantPuertosValidos() {
        return cantPuertosValidos;
    }
    public void setCantPuertosValidos(int cantPuertosValidos) {
        this.cantPuertosValidos = cantPuertosValidos;
    }

    public Dispositivo(String nombreFabricante, String modelo, int stock, int precioVenta, int cantPuertosValidos) {
        super(nombreFabricante, modelo, stock, precioVenta);
        this.cantPuertosValidos = cantPuertosValidos;
    }


}
