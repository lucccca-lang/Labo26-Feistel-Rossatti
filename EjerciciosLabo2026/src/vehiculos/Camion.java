package vehiculos;

public class Camion extends Vehiculo{
    private int capCarga;

    public int getCapCarga() {
        return capCarga;
    }
    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public Camion(String marca, String modelo, String color, int cantRuedas, int anioFabricacion, String patente, int capCarga){
        super(marca, modelo, color, cantRuedas, anioFabricacion, patente);
        this.capCarga = capCarga;
    }
}
