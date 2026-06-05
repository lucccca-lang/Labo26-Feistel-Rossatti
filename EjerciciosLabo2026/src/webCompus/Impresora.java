package webCompus;

public class Impresora extends DispSalida{
    private String metodoImpresion;

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }

    public Impresora(String nombreFabricante, String modelo, int stock, int precioVenta, int cantPuertosValidos, String metodoImpresion) {
        super(nombreFabricante, modelo, stock, precioVenta, cantPuertosValidos);
        this.metodoImpresion = metodoImpresion;
    }
}
