import FormasGeometricas.Circulo;
import FormasGeometricas.Rectangulo;

public class Main {
    public static void main(String[] args) {

        /*
                                        //llamar a parametrizada
        Circulo c1 = new Circulo(4);

                                       //llamar a por defecto
        Circulo c2 = new Circulo();

        System.out.println("circulo 1: " + c1.getRadio());
        System.out.println("circulo 2: " + c2.getRadio());
        System.out.println("el area del circulo 1 es: " + c1.calcularArea());
        System.out.println("el area del circulo 2 es: " + c2.calcularArea());
        System.out.println("el perimetro del ciculo 1 es: " + c1.calcularPerimetro());
        System.out.println("el perimetro del ciculo 2 es: " + c2.calcularPerimetro());
        */

        Rectangulo r1 = new Rectangulo(3,5);

        System.out.println("base del rectangulo 1: " + r1.getBase());
        System.out.println("altura del rectangulo 1: " + r1.getAltura());
        System.out.println("el area del rectangulo 1 es: " + r1.calculoArea());
        System.out.println("el perimetro del rectangulo 1 es: " + r1.calculoPerimetro());

    }
}
