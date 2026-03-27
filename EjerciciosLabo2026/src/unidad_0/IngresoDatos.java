package unidad_0;

import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {

        /*1*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("decime un numero");
        int n = scanner.nextInt();

        System.out.println("decime un double");
        double a = scanner.nextDouble();

        System.out.println("decime un string que empiece con la letra deseada");
        char c = scanner.next().charAt(0);

        System.out.println("variable n= " + n);
        System.out.println("variable a= " + a);
        System.out.println("variable c= " + c);

        System.out.println("la suma  es: " + (n + a));
        System.out.println("la diferencia  es: " + (a - n));

        System.out.println("valor numerico de c es: " + ((int)c));
    }
}
