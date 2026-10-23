package fundacionEndo;

import java.time.LocalDate;

public class Geronte extends Paciente{
    public Geronte(String nombre, String apellido, LocalDate fechaNac, String genero, TipoSangre tipoSangre) {
        super(nombre, apellido, fechaNac, genero, tipoSangre);
    }
}
