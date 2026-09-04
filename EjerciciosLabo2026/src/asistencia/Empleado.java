package asistencia;

import seresVivos.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {
    private HashSet<DiasSemana> diasSemanas;
    private HashSet<LocalDateTime> asistencias;

    public HashSet<LocalDateTime> getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(HashSet<LocalDateTime> asistencias) {
        this.asistencias = asistencias;
    }
    public HashSet<DiasSemana> getDiasSemanas() {
        return diasSemanas;
    }
    public void setDiasSemanas(HashSet<DiasSemana> diasSemanas) {
        this.diasSemanas = diasSemanas;
    }

    public Empleado(String nombre, String apellido, LocalDate fechaNac, int numCelular, HashSet<DiasSemana> diasSemanas , HashSet<LocalDateTime> asistencias) {
        super(nombre, apellido, fechaNac, numCelular);
        this.diasSemanas = diasSemanas;
        this.asistencias = asistencias;
    }


}

/*   private LocalDate fecha;
    private LocalTime hora;
*/