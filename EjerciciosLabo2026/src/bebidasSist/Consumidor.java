package bebidasSist;

import seresVivos.Persona;

import java.util.ArrayList;

public class Consumidor extends Persona {
    private int dni;
    private ArrayList<Consumicion> listaBebidas;

    public Consumidor(String nombre, String apellido, int dni, ArrayList<Consumicion> listaBebidas) {
        super(nombre, apellido);
        this.dni = dni;
        this.listaBebidas = listaBebidas;
    }

    public int coeficienteHidratacion (){
        int hidratacionTot = 0;
        for(Consumicion consu : listaBebidas){
            hidratacionTot += consu.hidratatacion();
        }
        return hidratacionTot;
    }
}


