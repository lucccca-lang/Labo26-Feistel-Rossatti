package deportes;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String campeonato;
    private ArrayList<Jugador> jugadores;
    private ArrayList<String> turno;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCampeonato() {
        return campeonato;
    }
    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public ArrayList<String> getTurno() {
        return turno;
    }
    public void setTurno(ArrayList<String> turno) {
        this.turno = turno;
    }


    public void agregarJugador(Jugador jugador){
        if (cantJugadores() < 11){
        jugadores.add(jugador);
        }
    }

    public int cantJugadores() {
        return jugadores.size();
    }

    public int cantCapitan(){
        int cantCapi = 0;
            for(Jugador cap : jugadores){
                if(cap.isCapitan()){
                    cantCapi++;
                }
            }
        return cantCapi;
    }

    public boolean dorsalValido(){
        boolean valido = true;
            for (Jugador dors : jugadores){
                for (Jugador dors1 : jugadores){
                    if (dors.getDorsal() == dors1.getDorsal()) {
                        valido = false;
                    }
                }
            }
        return valido;
    }

    public boolean horarioCargado() {
        if (turno.isEmpty()) {
            return false;
        }
    return true;
    }



}
