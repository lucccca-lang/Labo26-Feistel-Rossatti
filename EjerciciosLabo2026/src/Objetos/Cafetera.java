package Objetos;

public class Cafetera {

    private double cantMax;
    private double cantActual;

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }
    public void setCantMax(double cantMax) {
        this.cantMax = cantMax;
    }

    public double getCantActual() {
        return cantActual;
    }
    public double getCantMax() {
        return cantMax;
    }

    public Cafetera(){
        this.cantMax = 1000;
        this.cantActual = 0;
    }

    public Cafetera(double cantMax){
        this.cantMax = cantMax;
        this.cantActual = cantMax;
    }

    public Cafetera(double cantMax, double cantActual){
        this.cantMax = cantMax;
        if(cantActual > cantMax){
            this.cantActual = cantMax;
        }
        else{
            this.cantActual = cantActual;
        }
    }

    public void llenarCafetera(){
        this.cantActual = this.cantMax;
    }

    public void servirTaza(int capacidad){
        if(this.cantActual >= capacidad){
            this.cantActual = this.cantActual - capacidad;
        }
        else{
            this.cantActual = 0;
        }
    }

    public void vaciarCafetera(){
        this.cantActual = 0;
    }

    public void agregarCafe(int cantidad){
        if(this.cantActual + cantidad > this.cantMax){
            this.cantActual = this.cantMax;
        }
        else{
            this.cantActual = this.cantActual + cantidad;
        }
    }


    public static void main(String[] args) {

        Cafetera c1 = new Cafetera();
        System.out.println("cafetera c1 (defecto)= " + c1.getCantActual() + c1.getCantMax());

        Cafetera c2 = new Cafetera(500);
        System.out.println("cafetera c2 (max igual act)" + c2.getCantActual() + c2.getCantMax());

        Cafetera c3 = new Cafetera(500, 600);
        System.out.println("cafetera c3 (act = max se ajusta )" + c3.getCantActual() + c3.getCantMax());

        System.out.println("mostrar metodos con c1(por defecto)");

        c1.llenarCafetera();
        System.out.println("dsp de llenar " + c1.getCantMax() + c1.getCantActual());

        c1.agregarCafe(100);
        System.out.println("agregamos 100cc y cant actual= " + c1.getCantActual() + " y cant max es= " +
        c1.getCantMax());
    }
}
