package formasGeometricas;

import java.sql.Driver;

public class Rectangulo extends FormasGeo{
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


    @Override
    public double calcularArea(){
        double area;
        area =  base * altura;
        return area;
    }
    @Override
    public double calcularPerimetro (){
        double perimetro;
        perimetro = (base + altura) * 2;
        return perimetro;
    }

}
