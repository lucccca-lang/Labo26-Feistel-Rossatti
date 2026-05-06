package vehiculos;

import java.sql.SQLOutput;

public class Submarino extends Vehiculo{
    private int profMax;
    private int profActual;

    public Submarino(){
        super();
        this.profMax = -1000;
        this.profActual = 0;
    }

    public int getProfMax() {
        return profMax;
    }
    public int getProfActual() {
        return profActual;
    }

    public void setProfMax(int profMax) {
        this.profMax = profMax;
    }
    public void setProfActual(int profActual) {
        this.profActual = profActual;
    }

    public void sumergir(int metros) {
        if (this.profActual - metros < this.profMax) {
            System.out.println("SUPERANDO PROFUNDIDAD MAXIMA");
        }
        else{
            System.out.println("Sumergiendo con exito " + metros + "m");
            this.profActual = this.profActual - metros;
            System.out.println("Profundidad actual: " + profActual + "m");
        }
    }

    public void emerger(int metros){
        if (this.profActual + metros > 0){
            System.out.println("NO PODES VOLAR");
        }
        else{
            System.out.println("Estas emergiendo " + metros + "m");
            this.profActual = this.profActual + metros;
            System.out.println("Profundidad actual: " + profActual + "m");
        }
    }

    public static void main(String[] args) {

        Submarino submarino1 = new Submarino();
        System.out.println("Nombre: " + submarino1.getModelo() + " " + submarino1.getProfActual() + " " + submarino1.getProfMax());

        submarino1.sumergir(200);
        submarino1.emerger(100);

    }
}
