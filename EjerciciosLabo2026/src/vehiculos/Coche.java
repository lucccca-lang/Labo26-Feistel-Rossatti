package vehiculos;

public class Coche extends Vehiculo {
    private double velocidad;
    private boolean descapotable;

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public boolean isDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }


    public Coche(String marca, String modelo, String color, int cantRuedas, int anioFabricacion, String patente, double velocidad, boolean descapotable){
        super(marca, modelo, color, cantRuedas, anioFabricacion, patente);
        this.velocidad = velocidad;
        this.descapotable = descapotable;
    }

    public double acelerar (){
        this.velocidad = velocidad + 1;
        return velocidad;
    }

    public double frenar (){
        this.velocidad = velocidad - 1;
        return velocidad;
    }

    public double mostrarVelocidad (){
        return velocidad;
    }
}
