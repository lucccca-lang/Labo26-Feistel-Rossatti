package webCompus;

public class DispEntrada extends Dispositivo{
    private String tipoConector;

    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public DispEntrada(String nombreFabricante, String modelo, float precioVenta, int stock, int cantPuertosValidos, String tipoConector) {
        super(nombreFabricante, modelo, precioVenta, stock, cantPuertosValidos);
        this.tipoConector = tipoConector;
    }

    @Override
    public int EsDispEntrada() {
        return 1;
    }
}
