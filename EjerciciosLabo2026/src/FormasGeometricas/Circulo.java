package FormasGeometricas;

import static java.lang.Math.pow;

public class Circulo {
    private double radio;

    //por defecto
    public Circulo() {
        radio = 2;
    }

    //parametrizada
    public Circulo(double radio){
        this.radio = radio;
    }

    //get
    public double getRadio(){
        return radio;
    }

    //set
    public void setRadio(double radio){
        this.radio = radio;
    }

    //metodo
    public double calcularArea (){
        double area;
        area =  Math.PI * pow(radio,2);
        return area;
    }

    public double calcularPerimetro (){
        double peri;
        peri = 2 * Math.PI * radio;
        return peri;
    }

}