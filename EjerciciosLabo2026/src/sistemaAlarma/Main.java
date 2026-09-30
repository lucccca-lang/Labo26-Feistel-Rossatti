package sistemaAlarma;

import telefonia.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        SensorPres s1 = new SensorPres(true,70, LocalDate.now());
        SensorTemp s2 = new SensorTemp(true, 50, LocalDate.now());

        Sistema sis1 = new Sistema(new ArrayList<>());
        sis1.getSensores().add(s1);
        sis1.getSensores().add(s2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero desde 0 hasta "+ sis1.getSensores().size() + ":");

        boolean noTengoNumero = true;                                         //while

        while(noTengoNumero) {
            try {
                int numero = scanner.nextInt();
                System.out.println(sis1.getSensores().get(numero));
                noTengoNumero = false;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("No es un numero");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("Numero es mayor al posible");
            }
        }

    }
}
