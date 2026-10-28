package poliSquadGame;

import java.util.HashSet;

public class Sistema {
    HashSet<Jugador> listaJugadores;
    HashSet<Prueba> listaPruebas;

    public Sistema(HashSet<Jugador> listaJugadores, HashSet<Prueba> listaPruebas) {
        this.listaJugadores = listaJugadores;
        this.listaPruebas = listaPruebas;
    }

    public void registrarJug(Jugador jug) {
        listaJugadores.add(jug);
    }

    public void agregarPrueba(Prueba pru) {
        listaPruebas.add(pru);
    }

    public int cantPruebasJugables() {
        int cant = 0;
        for (Prueba p : listaPruebas) {
            if (p instanceof Jugable) {
                cant++;
            }
        }
        return cant;
    }


    public boolean verificarPrueba(Jugador jug, Jugable pru) {
        try {
            jug.verificacion();
            System.out.println(jug.getNombre() + " puede realizar la prueba " + pru);
            return true;
        } catch (NoTieneEnergiaException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void jugarPrueba(Jugador jug, Jugable pru) {
        jug.realizarPrueba(pru);
        //if (this.verificarPrueba(jug, pru) && pru.corroborarRiesgo(jug)) {
        //    pru.consumirEnergia(jug);
        //    jug.corroborarEliminacion();
        //    jug.terminarPrueba(rec);
        //}
    }


}