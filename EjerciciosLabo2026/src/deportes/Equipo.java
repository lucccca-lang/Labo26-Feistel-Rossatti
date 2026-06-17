package deportes;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Turno> disponibilidad;
    private Jugador capitan;
    private ArrayList<Jugador> lista;

    public Equipo(String nombre ,ArrayList<Turno> disponibilidad, Jugador capitan, ArrayList<Jugador> lista) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.capitan = capitan;
        this.lista = lista;
    }

    public ArrayList<Turno> getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(ArrayList<Turno> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public Jugador getCapitan() {
        return capitan;
    }
    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }
    public ArrayList<Jugador> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador jugador) {
        if (cantJugadores() < 11) {
            lista.add(jugador);
        }
    }

    public int cantJugadores() {
        return lista.size();
    }

    public boolean comprobarEquipo() {
        boolean valido = true;
        for (Jugador lista : this.lista) {
            for (Jugador lista1 :this.lista) {
                if (lista.getNumero_de_camiseta() == lista1.getNumero_de_camiseta() && (!lista.equals(lista1))) {
                    valido = false;
                }
            }
        }
        if (disponibilidad.isEmpty()){
            valido = false;
        }
        return valido;
    }

}