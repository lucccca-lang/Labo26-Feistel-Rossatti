package arrays;

import seresVivos.Persona;

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



        personas.add(new Persona("Fernando", 4, "olazabal 7590"));
        personas.add(new Persona("Luis", 35, "ibera 5783"));
        personas.add(new Persona("Julua", 25, "condarco 5676"));

        for(Persona p : personas){
            if(p.getEdad() > 30){
                System.out.println(p.getNombre() + " es mayor a 30");
            }
        }
    }
}
