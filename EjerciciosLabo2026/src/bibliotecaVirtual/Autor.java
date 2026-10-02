package bibliotecaVirtual;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Autor extends Persona {
    public HashSet<LibroElectronico> listaBibliografia;

    public HashSet<LibroElectronico> getBibliografia() {
        return listaBibliografia;
    }
    public void setBibliografia(HashSet<LibroElectronico> bibliografia) {
        this.listaBibliografia = bibliografia;
    }

    public Autor(String nombre, LocalDate fechaNac, int DNI, HashSet<LibroElectronico> listaBibliografia) {
        super(nombre, fechaNac, DNI);
        this.listaBibliografia = listaBibliografia;
    }
}



