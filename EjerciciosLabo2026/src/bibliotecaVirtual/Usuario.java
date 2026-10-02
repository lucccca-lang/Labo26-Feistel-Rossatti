package bibliotecaVirtual;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private Membresia membresia;
    private HashSet<LibroElectronico> librosDescargados;

    public Membresia getMembresia() {
        return membresia;
    }
    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public HashSet<LibroElectronico> getLibrosDescargados() {
        return librosDescargados;
    }
    public void setLibrosDescargados(HashSet<LibroElectronico> librosDescargados) {
        this.librosDescargados = librosDescargados;
    }

    public Usuario(String nombre, LocalDate fechaNac, int DNI, String mail, Membresia membresia, HashSet<LibroElectronico> librosDescargados) {
        super(nombre, fechaNac, DNI, mail);
        this.membresia = membresia;
        this.librosDescargados = librosDescargados;
    }
}

