package unidad_0;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {

        String txt = "Ayer me compre muñecos de la marca `ToyCo´ por internet.";
        txt = txt.toLowerCase();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Decime una letra para reemplazar la e");
        char letra = scanner.next().charAt(0);

        for (int i = 0; i < txt.length(); i++){

            if(txt.charAt(i) == 'e') {

                txt = txt.replace('e', letra);

            }
        }

        System.out.println(txt);
    }
}
