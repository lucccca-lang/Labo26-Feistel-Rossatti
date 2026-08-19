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
    public ArrayList<Plato> getPlatoTipo(Tipo tipo){
        ArrayList<Plato> platosFiltrados = new ArrayList<>();
        for(Plato plato: this.listaPlato){
            if(plato.esDeTipo(tipo)){
                platosFiltrados.add(plato);
            }
        }
        return  platosFiltrados;
    }
    public int cantRecetas(){
        return listaPlato.size();
    }
    public Plato platoMasPasos(){
        Plato platoMasPaso = this.listaPlato.getFirst();

        for(Plato plato: this.listaPlato){
            platoMasPaso = plato.platoMasPasos(platoMasPaso);
        }
        return  platoMasPaso;
    }

}
