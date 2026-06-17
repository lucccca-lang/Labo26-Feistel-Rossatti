package escuela;

import seresVivos.Persona;

import java.time.LocalDate;

public abstract class PersonaEducativa extends Persona {
    private int porcDesc;

    public PersonaEducativa(String nombre, String apellido, String direccion, LocalDate fechaNac, int porcDesc) {
        super(nombre, apellido, direccion, fechaNac);
        this.porcDesc = porcDesc;
    }

    public PersonaEducativa(String nombre, String apellido, int porcDesc) {
        super(nombre, apellido);
        this.porcDesc = porcDesc;
    }

    public PersonaEducativa(int porcDesc) {
        this.porcDesc = porcDesc;
    }

    public int getPorcDesc() {
        return porcDesc;
    }
    public void setPorcDesc(int porcDesc) {
        this.porcDesc = porcDesc;
    }
}
