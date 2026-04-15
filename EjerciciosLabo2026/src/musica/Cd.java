package musica;

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

    public elimina(int posicion){
        this.ca
    }

}
