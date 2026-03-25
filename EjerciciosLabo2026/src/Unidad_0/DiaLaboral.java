package Unidad_0;

import java.util.Scanner;
import  java.util.li
public class DiaLaboral {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String>DiasLaboral = List.of("lunes","martes","miercoles","jueves","viernes");
        String diaSemana = scanner.next().toLowerCase();



        if(DiasLaboral.contains(diaSemana)){
            System.out.println("Es un dia laboral");
        }
        else {
            System.out.println("No es un dia laboral");
        }
    }
}
