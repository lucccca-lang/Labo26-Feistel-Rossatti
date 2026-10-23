package fundacionEndo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main() {
        HashSet<String> listaS = new HashSet<>();
        listaS.add("correr");
        listaS.add("futbolear");
        listaS.add("basketear");
        listaS.add("gimnasio");

        HashSet<String> listaS2 = new HashSet<>();
        listaS2.add("correr");
        listaS2.add("futbolear");
        listaS2.add("basketear");
        listaS2.add("gimnasio");
        listaS2.add("afsj");

        Joven j1 = new Joven("Facundo", "Feistel", LocalDate.of(2000, 9, 8), "masculino", TipoSangre.A_POS, listaS);
        Joven j2 = new Joven("Lucca", "Rossatti", LocalDate.of(2010, 7, 4), "no binario", TipoSangre.B_NEG, listaS2);

        Ninio n1 = new Ninio("Agustin", "Feistel", LocalDate.of(2000, 9, 8), "masculino", TipoSangre.O_POS, NivelTolerancia.CINCO);
        Ninio n2 = new Ninio("Matias", "Feistel", LocalDate.of(2000, 9, 8), "masculino", TipoSangre.AB_NEG, NivelTolerancia.DIEZ);

        Adulto a1 = new Adulto("asas","adsdasf", LocalDate.now(),"aaa", TipoSangre.A_NEG);
        Geronte g1 = new Geronte("ass","adasf", LocalDate.now(),"aaxhja", TipoSangre.B_NEG);



        HashMap<PorTratar, Integer> listaPacSi = new HashMap<>();
        listaPacSi.put(j1, 3);
        listaPacSi.put(n1, 32);

        HashSet<Paciente> listaPac = new HashSet<>();
        listaPac.add(a1);
        listaPac.add(n2);

        Sistema sis1 = new Sistema(listaPacSi, listaPac);



        System.out.println(j1.verificar());
        System.out.println(j2.verificar());

        System.out.println(j1.solicitarTratamiento());
        System.out.println(j2.solicitarTratamiento());

        System.out.println(j1.solicitarCostoTratamiento());
        System.out.println(j2.solicitarCostoTratamiento());

        sis1.avanzarTratamiento(n1);

        System.out.println("la cantidad de no aplicados es: " + sis1.cantPacNoAplicados());
    }
}