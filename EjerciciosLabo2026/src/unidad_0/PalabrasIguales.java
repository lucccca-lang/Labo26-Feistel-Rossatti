package unidad_0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra 1: ");
        String palabra1 = scanner.next();
        System.out.println("Ingrese la palabra 2: ");
        String palabra2 = scanner.next();

        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No Son iguales");
        }

    }
}
