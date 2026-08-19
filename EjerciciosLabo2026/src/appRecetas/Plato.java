package appRecetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> listaPasos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Dificultad getDificultad() {
        return dificultad;
    }
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
    public ArrayList<String> getListaPasos() {
        return listaPasos;
    }
    public void setListaPasos(ArrayList<String> listaPasos) {
        this.listaPasos = listaPasos;
    }

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> listaPasos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.listaPasos = listaPasos;
    }

    public abstract boolean esDeTipo(Tipo tipo);

    public abstract void mostrarDetalles();

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", dificultad=" + dificultad +
                ", listaPasos=" + listaPasos +
                '}';
    }

    public int numPasos(){
        return  this.listaPasos.size();
    }

    public  Plato platoMasPasos(Plato plato){
        if(this.numPasos() > plato.numPasos()){
            return this;
        }
        return plato;
    }
}
