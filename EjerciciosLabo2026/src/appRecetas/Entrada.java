package appRecetas;

import java.util.ArrayList;

public class Entrada extends Plato{
    private boolean esFria;

    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> listaPasos) {
        super(nombre, dificultad, listaPasos);
        this.esFria = isEsFria();
    }

    @Override
    public boolean esDeTipo(Tipo tipo) {
        return tipo == Tipo.ENTRADA;
    }

    public boolean isEsFria() {
        return esFria;
    }
    public void setEsFria(boolean esFria) {
        this.esFria = esFria;
    }


    @Override
    public void mostrarDetalles() {
            if(isEsFria()){
                for (String p : getListaPasos()) {
                System.out.println(p + "al finalizar, guardar en la heladera");

                }
            }
            else{
                System.out.println("prender el horno");
                for (String p : getListaPasos()){
                    System.out.println(p + "cocina puta");
                }
            }
    }

    @Override
    public String toString() {
        return  super.toString() + "Entrada{" +
                "esFria=" + esFria +
                '}';
    }
}