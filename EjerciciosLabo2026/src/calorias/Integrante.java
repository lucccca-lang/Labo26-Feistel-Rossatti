package calorias;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Integrante extends Persona {
    private HashMap<Platos, Integer> ListaPlatos;

    public HashMap<Platos, Integer> getListaPlatos() {
        return ListaPlatos;
    }
    public void setListaPlatos(HashMap<Platos, Integer> listaPlatos) {
        ListaPlatos = listaPlatos;
    }

    public Integrante(String nombre, LocalDate fechaNac, HashMap<Platos, Integer> listaPlatos) {
        super(nombre, fechaNac);
        ListaPlatos = listaPlatos;
    }
}
