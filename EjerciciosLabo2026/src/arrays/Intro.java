package arrays;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Intro {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> palabras = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();

        int suma = 0;
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for(int num : numeros){
            suma += num;
        }
        System.out.println("La suma:" + suma);




        palabras.add("hola");
        palabras.add("chau");
        palabras.add("cebra");

        for(String pal : palabras){
            if(pal.charAt(0)=='c'){
                System.out.println("Las palabras son:" + pal);
            }
        }



        personas.add(new Persona("Fernando", "dasdasd", "olazabal 7590", LocalDate.of(1999,1,1)));
        personas.add(new Persona("Luis", "sdasdas", "ibera 5783", LocalDate.of(1999,1,1)));
        personas.add(new Persona("Julua", "dasdasd", "condarco 5676", LocalDate.of(1999,1,1)));

        for(Persona p : personas){
            if(p.getEdad() > 30){
                System.out.println(p.getNombre() + " es mayor a 30");
            }
        }
    }
}
