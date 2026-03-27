package unidad_0;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("decime un numero");
        int a = scanner.nextInt();

        System.out.println("decime otro numero");
        int b = scanner.nextInt();

        if ( a>b ){
            System.out.println("a es el numero mayor");
        }
        else if ( b>a ){
            System.out.println("b es el numero mayor");
        }
        else{
            System.out.println("a y b son iguales");
        }
    }
}
