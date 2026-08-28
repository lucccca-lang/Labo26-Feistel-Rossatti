package sistAlturaPeso;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Paciente extends Persona {
    private HashMap<LocalDate, Medicion> medicion;

    public HashMap<LocalDate, Medicion> getMedicion() {
        return medicion;
    }
    public void setMedicion(HashMap<LocalDate, Medicion> medicion) {
        this.medicion = medicion;
    }

    public Paciente(String nombre, String apellido, LocalDate fechaNac) {
        super(nombre, apellido, fechaNac);
    }



}
