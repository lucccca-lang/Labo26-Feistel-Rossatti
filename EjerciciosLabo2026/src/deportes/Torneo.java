package deportes;

import java.util.ArrayList;

public class Torneo {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void validacion(){
        for(Equipo eq : equipos){
            if(eq.cantJugadores() == 11 && eq.cantCapitan() == 1 && eq.dorsalValido() && eq.horarioCargado()){
                System.out.println("el equipo: " + eq + " es valido para competir");
            }
            else{
                System.out.println("el equipo: " + eq + " no es valido para competir");
            }
        }
    }

    public boolean coincidenEnDispo(Equipo eq1, Equipo eq2){
        if (eq1.getTurno().contains("mañana") && eq2.getTurno().contains("mañana")){
            return true;
        }
        else if (eq1.getTurno().contains("tarde") && eq2.getTurno().contains("tarde")){
            return true;
        }
        if (eq1.getTurno().contains("noche") && eq2.getTurno().contains("noche")){
            return true;
        }
    else {
        return false;
        }
    }

    public String mismoTurno(Equipo eq1, Equipo eq2){

    }

    public void fixture() {
        for (Equipo eq1 : equipos) {
            for (Equipo eq2 : equipos) {
                if(coincidenEnDispo(eq1,eq2)){
                   partidos.add(new Partido(eq1,eq2, mismoTurno(eq1,eq2)));
                }
                if (eq1 != eq2 && ) {

                }
            }
        }
    }






}
