package asistencia;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Empleado extends Persona {
    private HashSet<DiasSemana> diasSemanas;
    private HashSet<Asistencia> asistencias;

    public HashSet<Asistencia> getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(HashSet<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
    public HashSet<DiasSemana> getDiasSemanas() {
        return diasSemanas;
    }
    public void setDiasSemanas(HashSet<DiasSemana> diasSemanas) {
        this.diasSemanas = diasSemanas;
    }

    public Empleado(String nombre, String apellido, LocalDate fechaNac, int numCelular, HashSet<DiasSemana> diasSemanas , HashSet<Asistencia> asistencias) {
        super(nombre, apellido, fechaNac, numCelular);
        this.diasSemanas = diasSemanas;
        this.asistencias = asistencias;
    }


}
