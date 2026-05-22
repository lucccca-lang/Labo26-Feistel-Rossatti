package EjLlamadasProfe;

public class LlamadaLocal extends Llamada {
    private String provinciaOrigen;
    private String provinciaDestino;
    private double costoPorMinuto;

    public LlamadaLocal(Empleado origen, Empleado destino, int duracionMinutos) {
        super(origen, destino, duracionMinutos);
        this.provinciaOrigen = origen.getProvincia();
        this.provinciaDestino = destino.getProvincia();
        this.costoPorMinuto = 10;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public String getProvinciaDestino() {
        return provinciaDestino;
    }

    public double calcularCosto() {
        return getDuracionMinutos() * costoPorMinuto;
    }

    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " | Provincia origen: " + provinciaOrigen
                + " | Provincia destino: " + provinciaDestino
                + " | Llamada local ";
    }
}
