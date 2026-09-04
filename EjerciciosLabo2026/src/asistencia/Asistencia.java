package asistencia;

import java.time.LocalDate;
import java.time.LocalTime;

public class Asistencia {
    private LocalDate fecha;
    private LocalTime hora;



    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
