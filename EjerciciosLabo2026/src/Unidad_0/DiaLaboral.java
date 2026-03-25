package Unidad_0;

import java.util.Scanner;


public class DiaLaboral {
    public static void main(String[] args) {

        System.out.println("ingrese un dia de la semana y le diremos si es laboral: ");
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.next();
        dia = dia.toLowerCase();

        if(dia.equals("sabado") || dia.equals("domingo"))
        {
            System.out.println("no es un dia laboral");
        }

        else
        {
            System.out.println("es un dia laboral");
        }
    }
}
