package clubFutbol;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Integrante extends Persona {
    private HashMap<String, Integer> listaHistorialClubes;


    public HashMap<String, Integer> getListaHistorialClubes() {
        return listaHistorialClubes;
    }

    public void setListaHistorialClubes(HashMap<String, Integer> listaHistorialClubes) {
        this.listaHistorialClubes = listaHistorialClubes;
    }

    public Integrante(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes) {
        super(nombre, fechaNac);
        listaHistorialClubes = listaHistorialClubes;
    }

    public abstract boolean requisitos() ;
    public abstract boolean reqRenovacion() ;
    public abstract String toString();
}
