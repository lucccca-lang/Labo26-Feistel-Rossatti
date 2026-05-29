package webCompus;

public class DispEntrada extends Dispositivo{
    private String tipoConector;

    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public DispEntrada(String nombreFabricante, String modelo, int stock, int precioVenta, int cantPuertosValidos, String tipoConector) {
        super(nombreFabricante, modelo, stock, precioVenta, cantPuertosValidos);
        this.tipoConector = tipoConector;
    }

    @Override
    public int EsDispEntrada() {
        return 1;
    }
}
