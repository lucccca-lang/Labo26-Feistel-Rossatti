package barSist;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main() {

        HashMap<Integer, ColorFranja> listaPuntaje = new HashMap<>();
        listaPuntaje.put(100, ColorFranja.ROJO);
        listaPuntaje.put(80, ColorFranja.AMARILLO);
        listaPuntaje.put(60, ColorFranja.BLANCO);

        DianaCircular dCi1 = new DianaCircular("Prime", "Alto", listaPuntaje);
        DianaCuadrada dcu1 = new DianaCuadrada("Aura", "Jodido", listaPuntaje, 10);
        DianaRectangular dr1 = new DianaRectangular("PAtti", "Facil", listaPuntaje, 10, 8);
        HashSet<Diana> listaDianas = new HashSet<>();
        listaDianas.add(dCi1);
        listaDianas.add(dcu1);
        listaDianas.add(dr1);



        HashSet<String> listaTragos = new HashSet<>();
        listaTragos.add("Fernet");
        listaTragos.add("Vodka");
        BenefTrago benefTrago1 = new BenefTrago("Descuento Coca", "Matias", listaTragos);

        HashSet<String> listaGaseosas = new HashSet<>();
        listaGaseosas.add("Coca");
        listaGaseosas.add("JUgo");
        BenefGaseosa benefGaseosa1 = new BenefGaseosa("Descuento mucho", "Agus", listaGaseosas);

        HashSet<String> listaComidas = new HashSet<>();
        listaComidas.add("Pizza");
        listaComidas.add("Pastas");
        BenefComida benefComida1 = new BenefComida("Mas descuento", "Martin", listaComidas);

        HashSet<Beneficio> listaBeneficios = new HashSet<>();
        listaBeneficios.add(benefTrago1);
        listaBeneficios.add(benefGaseosa1);
        listaBeneficios.add(benefTrago1);

        HashSet<BenefAcumulable> listaBenefAcu = new HashSet<>();
        listaBenefAcu.add(benefGaseosa1);
        listaBenefAcu.add(benefComida1);

        Bar b1 = new Bar(listaDianas, 10, 6000, listaBeneficios, listaBenefAcu);



        HashSet<Bar> listaBares = new HashSet<>();
        listaBares.add(b1);

        HashSet<Diana> listaDianass = new HashSet<>();
        listaDianass.add(dCi1);

        HashSet<Beneficio> listaBenef = new HashSet<>();
        listaBenef.add(benefComida1);

        Sistema sis1 = new Sistema(listaBares, listaDianass, listaBenef);




        System.out.println(b1.cantBenefTragos());

        System.out.println(dCi1.calcularArea());
        System.out.println(dcu1.calcularArea());
        System.out.println(dr1.calcularArea());

        sis1.masCantPuntajesDistintos();
    }
}
