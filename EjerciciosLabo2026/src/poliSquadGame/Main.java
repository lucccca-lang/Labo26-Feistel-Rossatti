package poliSquadGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main() {


        HashSet<String> listaRec = new HashSet<>();
        listaRec.add("Oro");
        listaRec.add("Tenedor");

        HashSet<String> listaRec2 = new HashSet<>();
        listaRec2.add("Plata");

        HashMap<Prueba, String> listaDesc = new HashMap<>();

        ArrayList<Prueba> listaHistPruFav = new ArrayList<>();

        Jugador j1 = new Jugador("Fernando", 35, listaRec, listaDesc, listaHistPruFav);
        Jugador j2 = new Jugador("Luis", 11, listaRec2, listaDesc, listaHistPruFav);

        PruebaAvanzada pa1 = new PruebaAvanzada("Cosasss", 2, "Cofre", Escenario.CANICAS);
        PruebaAvanzada pa2 = new PruebaAvanzada("Plaza", 5, "Cuchara", Escenario.LUZ_ROJA_LUZ_VERDE);

        PruebaBasica pb1 = new PruebaBasica("Rapido si", 3, "Heladera", Escenario.DALGONA);
        PruebaBasica pb2 = new PruebaBasica("Sos", 8, "Auto", Escenario.PUENTE_DE_VIDRIO);

        PruebaMortal pm1 = new PruebaMortal("Upa", 10, "Moto", Escenario.CANICAS);

        HashSet<Jugador> listaJug = new HashSet<>();
        HashSet<Prueba> listaPrueba = new HashSet<>();

        Sistema sist = new Sistema(listaJug, listaPrueba);


        sist.agregarPrueba(pa1);
        sist.agregarPrueba(pa2);
        sist.agregarPrueba(pb1);
        sist.agregarPrueba(pb2);
        sist.agregarPrueba(pm1);

        sist.registrarJug(j1);
        sist.registrarJug(j2);

        sist.verificarPrueba(j1, pb1);

        System.out.println("La cantidad de pruebas jugables es " + sist.cantPruebasJugables());


        j2.describirPrueba(pb2, "Me parecio dificl");


        try {
            j1.registrarPruebaFav(pa2);
        }
        catch (PruebaYaElegidaActualmenteExcepcion e){
            System.out.println(e.getMessage());
        }

        sist.jugarPrueba(j2, pa2);
    }
}
