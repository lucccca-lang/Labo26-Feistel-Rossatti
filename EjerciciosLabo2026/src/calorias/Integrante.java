package calorias;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

    public int obtenerCalorias(){
        int suma = 0;
        for (Map.Entry<Platos, Integer> entry : ListaPlatos.entrySet()){
            suma += entry.getKey().getCantCalorias() * entry.getValue();
        }
        return suma;
    }

    public int cantidadPlatos(){
        int cant = 0;
        for (Map.Entry<Platos, Integer> entry : ListaPlatos.entrySet()){
            cant += entry.getValue();
        }
        return cant;
    }

    public double promedioPersona(){
        return obtenerCalorias() / cantidadPlatos();
    }

    public boolean tienePlato(Platos p){
        if (ListaPlatos.containsKey(p)) return true;
        return false;
    }

    public Platos platoPreferido() {
        Platos preferido = null;
        int maxCantidad = 0;
        for (Map.Entry<Platos, Integer> entry : ListaPlatos.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                maxCantidad = entry.getValue();
                preferido = entry.getKey();
            }
        }
        return preferido;
    }
}
