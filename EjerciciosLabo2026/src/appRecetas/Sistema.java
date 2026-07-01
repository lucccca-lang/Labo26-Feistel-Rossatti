package appRecetas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Plato> listaPlato;

    public void agregarPlato(Plato plato){
        listaPlato.add(plato);
    }
    public void eliminarPlato(Plato plato){
        listaPlato.remove(plato);
    }
    public void modificarPlato(Plato platoNuevo, Plato platoViejo){

    }
    public void buscarRecetas(Dificultad dificultad){
        for (Plato pp : listaPlato){
            if(pp.getDificultad().equals(dificultad)){
                System.out.println(pp);
            }
        }
    }
    public void filtrarReceta(String txt){


    }
    public int cantRecetas(){
        return listaPlato.size();
    }
    public Plato mayorReceta(){

    }

}
