package webCompus;

public class Impresora extends DispSalida{
    private MetodoImpresion metodoImpresion;

    public MetodoImpresion getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(MetodoImpresion metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }

    public Impresora(String nombreFabricante, String modelo, float precioVenta, int stock, int cantPuertosValidos, MetodoImpresion metodoImpresion) {
        super(nombreFabricante, modelo, stock, precioVenta, cantPuertosValidos);
        this.metodoImpresion = metodoImpresion;
    }
}
