package unidad_0;

import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Decime un numero: ");
        int n = scanner.nextInt();
        int cont = 0;

        while (n != -1){
            System.out.println("Decime otro numero: ");
            n = scanner.nextInt();
            cont ++;
        }

        System.out.println("La cant de numeros fueron: "+ cont);
    }
}
