package deportes;

import java.time.LocalDate;
import java.util.ArrayList;


public class Partido {
    private  Equipo equipo1;
    private  Equipo equipo2;
    private Turno turno;


    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.turno = asignarTurno(equipo1,equipo2);
    }


    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Turno asignarTurno(Equipo equipo1, Equipo equipo2){


        for (Turno turno1 : equipo1.getDisponibilidad()){
            for (Turno turno2 : equipo2.getDisponibilidad()){
                if (turno1.equals(turno2)){
                    return turno1;
                }
            }
        }


        return null;

    }


}