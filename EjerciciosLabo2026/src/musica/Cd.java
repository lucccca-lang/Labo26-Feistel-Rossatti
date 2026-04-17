package musica;

import seresVivos.Persona;

import java.util.ArrayList;

public class Cd {
    private ArrayList<Cancion> canciones;


    public Cd(){
        this.canciones = new ArrayList<>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void numeroCanciones(){
        System.out.println("la cantidad de canciones es: " + canciones.size());
    }

    public Cancion verCancion(int posicion){
        Cancion cancion = canciones.get(posicion);
        return cancion;

        /*return  canciones.get(posicion);*/
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion){
        this.canciones.set(posicion, nuevaCancion);
    }

    public void agrega(Cancion cancion){
        this.canciones.add(cancion);
    }

    public void elimina(int posicion){
        this.canciones.remove(posicion);
    }

    public void listarCanciones(){
        for(Cancion canc : canciones){
            System.out.println(canc.getTitulo());
        }
    }

    public static void main(String[] args) {
        Cd cd1 = new Cd();
        Cancion can1 = new Cancion();
        Cancion can2 = new Cancion("Hola", new Persona());
        cd1.agrega(can1);
        cd1.agrega(can2);

        cd1.listarCanciones();
    }
}
