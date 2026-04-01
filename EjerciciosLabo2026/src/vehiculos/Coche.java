package vehiculos;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private double velocidad;


    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public double getVelocidad() {
        return velocidad;
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    public Coche(String marca, String modelo, String color, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
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
