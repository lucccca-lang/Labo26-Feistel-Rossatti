package fundacionEndo;

import java.time.LocalDate;

public class Adulto extends Paciente{
    public Adulto(String nombre, String apellido, LocalDate fechaNac, String genero, TipoSangre tipoSangre) {
        super(nombre, apellido, fechaNac, genero, tipoSangre);
    }
}
