package fundacionEndo;

import empAgro.PaisOrigen;
import seresVivos.Persona;

import java.time.LocalDate;

public abstract class Paciente extends Persona {
    private String genero;
    private TipoSangre tipoSangre;

    public Paciente(String nombre, String apellido, LocalDate fechaNac, String genero, TipoSangre tipoSangre) {
        super(nombre, apellido, fechaNac);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }
}
