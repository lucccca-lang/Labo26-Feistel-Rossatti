package FormasGeometricas;

import static java.lang.Math.pow;

public class Rectangulo {
    private double base;
    private double altura;


    //parametrizada
    public Rectangulo (double base, double altura){
    this.base = base;
    this.altura = altura;
    }

    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculoArea(){
        double area;
        area =  base * altura;
        return area;
    }

    public double calculoPerimetro (){
        double perimetro;
        perimetro = (base + altura) * 2;
        return perimetro;
    }

}
