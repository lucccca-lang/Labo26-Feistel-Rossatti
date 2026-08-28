package bebidasSist;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Consumidor> listaConsumidores;

    public ArrayList<Consumidor> getListaConsumidores() {
        return listaConsumidores;
    }
    public void setListaConsumidores(ArrayList<Consumidor> listaConsumidores) {
        this.listaConsumidores = listaConsumidores;
    }

    public Sistema(ArrayList<Consumidor> listaConsumidores) {
        this.listaConsumidores = listaConsumidores;
    }

    public void agregarConsu(Consumidor persona){
        listaConsumidores.add(persona);
    }

    public void mejorCoef(){
        Consumidor mejorCons = listaConsumidores.getFirst();
        for(Consumidor pers1: listaConsumidores){
            if(pers1.coeficienteHidratacion() > mejorCons.coeficienteHidratacion()){
                mejorCons = pers1;
            }
        }
        System.out.println(mejorCons);
    }

    public void peorCoef(){
        Consumidor peorCons = listaConsumidores.getFirst();
        for(Consumidor pers1: listaConsumidores){
            if(pers1.coeficienteHidratacion() < peorCons.coeficienteHidratacion()){
                peorCons = pers1;
            }
        }
        System.out.println(peorCons);
    }

    public void  consumir(Consumidor consumidor,Bebida bebida, int cantidad) {
        Consumicion consumicion = new Consumicion(bebida, cantidad);
    }
}
