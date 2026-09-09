package calorias;

import java.util.HashSet;

public class Platos {
    private String nombre;
    private HashSet<String> listaIngredientes;
    private int cantCalorias;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public HashSet<String> getListaIngredientes() {
        return listaIngredientes;
    }
    public void setListaIngredientes(HashSet<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
    public int getCantCalorias() {
        return cantCalorias;
    }
    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }



}
