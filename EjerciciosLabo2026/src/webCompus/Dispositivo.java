package webCompus;

public class Dispositivo extends Componente{
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


}
