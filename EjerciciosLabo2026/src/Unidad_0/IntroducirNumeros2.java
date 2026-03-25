package Unidad_0;

import java.util.Scanner;

public class IntroducirNumeros2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int cont = 0;
        int mayor = 0;
        int menor = 0;
        int suma = 0;
        int aux = 0;
        int sumap = 0;
        int suman = 0;

        while (n != -1){

            System.out.println("Decime un numero: ");
            n = scanner.nextInt();
            if (n != -1) {
                cont ++;
                suma = suma + n;
            }

            if (aux < n){
                sumap = sumap + n;
            }

            if (aux > n) {
                suman = suman + n;
            }

            if (n > mayor && n != -1){
                mayor = n;
            }
            if (n < menor && n != -1){
                menor = n;
            }


        }



        System.out.println("La cant de numeros fueron: " + cont);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La suma de todos es: " + suma);
        System.out.println("La suma de positivos es: " + sumap);
        System.out.println("La suma de negativos es: " + suman);

    }
}
