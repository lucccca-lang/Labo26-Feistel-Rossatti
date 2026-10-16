package deportes;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Turno> disponibilidad;
    private JugadorCurling capitan;
    private ArrayList<JugadorCurling> lista;

    public Equipo(String nombre , ArrayList<Turno> disponibilidad, JugadorCurling capitan, ArrayList<JugadorCurling> lista) {
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
    public JugadorCurling getCapitan() {
        return capitan;
    }
    public void setCapitan(JugadorCurling capitan) {
        this.capitan = capitan;
    }
    public ArrayList<JugadorCurling> getLista() {
        return lista;
    }
    public void setLista(ArrayList<JugadorCurling> lista) {
        this.lista = lista;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(JugadorCurling jugadorCurling) {
        if (cantJugadores() < 11) {
            lista.add(jugadorCurling);
        }
    }

    public int cantJugadores() {
        return lista.size();
    }

    public boolean comprobarEquipo() {
        boolean valido = true;
        for (JugadorCurling lista : this.lista) {
            for (JugadorCurling lista1 :this.lista) {
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