package clubFutbol;

import seresVivos.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public abstract class CuerpoTecnico extends Integrante {

    private String tituloProf;
    private int aniosExp;

    public String getTituloProf() {
        return tituloProf;
    }
    public void setTituloProf(String tituloProf) {
        this.tituloProf = tituloProf;
    }
    public int getAniosExp() {
        return aniosExp;
    }
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public CuerpoTecnico(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes, String tituloProf, int aniosExp) {
        super(nombre, fechaNac, listaHistorialClubes);
        this.tituloProf = tituloProf;
        this.aniosExp = aniosExp;
    }
}
