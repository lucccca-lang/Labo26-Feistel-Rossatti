package clubFutbol;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public abstract class  Jugador extends Integrante{

    private String ProvOrigen;
    private Posicion posicion;
    private int numCamiseta;

    public String getProvOrigen() {
        return ProvOrigen;
    }
    public void setProvOrigen(String provOrigen) {
        ProvOrigen = provOrigen;
    }
    public Posicion getPosicion() {
        return posicion;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public int getNumCamiseta() {
        return numCamiseta;
    }
    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Jugador(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes, String provOrigen, Posicion posicion, HashSet<String> listaHistorialClubes1, int numCamiseta) {
        super(nombre, fechaNac, listaHistorialClubes);
        ProvOrigen = provOrigen;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
    }

}
