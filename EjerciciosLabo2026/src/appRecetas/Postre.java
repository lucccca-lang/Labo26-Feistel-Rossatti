package appRecetas;

import java.util.ArrayList;

public class Postre extends Plato {
    private int tempHorno;
    private boolean aptoDiabetico;

    public Postre(String nombre, Dificultad dificultad, ArrayList<String> listaPasos, int tempHorno, boolean aptoDiabetico) {
        super(nombre, dificultad, listaPasos);
        this.tempHorno = tempHorno;
        this.aptoDiabetico = aptoDiabetico;
    }

    public int getTempHorno() {
        return tempHorno;
    }
    public void setTempHorno(int tempHorno) {
        this.tempHorno = tempHorno;
    }
    public boolean isAptoDiabetico() {
        return aptoDiabetico;
    }
    public void setAptoDiabetico(boolean aptoDiabetico) {
        this.aptoDiabetico = aptoDiabetico;
    }


    @Override
    public void mostrarDetalles() {
        for(String p : getListaPasos()){
            System.out.println(p + "Recorda: Limpiar la cocina y poner el horno al minimo");
        }
    }


}
