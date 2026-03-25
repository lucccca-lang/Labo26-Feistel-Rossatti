package Unidad_0;
import java.util.Scanner;
import java.util.Vector;
public class MontaniaRusa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float altura, altTotal = 0, altProm;
        Vector <Float> personas = new Vector<>();
        int cont = 0;

        System.out.println("Ingrese la altura: ");
        altura = scanner.nextFloat();

        while(altura != 0)
        {
            if(altura < 1.40)
            {
                System.out.println("Ingreso un enano, debe ser retirado");
            }

            else {
                personas.add(altura);
            }

            System.out.println("Ahora ingrese otra altura: ");
            altura = scanner.nextFloat();
        }

        for(int i = 0; i < personas.size(); i++)
        {
            cont++;
            altTotal += personas.get(i);
        }

        altProm = altTotal / cont;

        System.out.println("En total ingresaron: " + cont);
        System.out.println("La altura promedio es: " + altProm);

    }
}
