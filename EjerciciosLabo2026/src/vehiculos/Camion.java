package vehiculos;

public class Camion extends Vehiculo{
    private int capCarga;
    private int capActual;

    public int getCapCarga() {
        return capCarga;
    }
    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }
    public int getCapActual() {
        return capActual;
    }
    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }

    public Camion(String marca, String modelo, Color color, int cantRuedas, int anioFabricacion, String patente, int capCarga, int capActual){
        super(marca, modelo, color, cantRuedas, anioFabricacion, patente);
        this.capCarga = capCarga;
        this.capActual = capActual;
    }
}
