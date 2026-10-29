package fabricaPoloNorte;

import java.time.LocalDate;
import java.util.HashSet;

public class Aprendiz extends Ayudante{
    private HashSet<String> listaMatProhibidos;

    public HashSet<String> getListaMatProhibidos() {
        return listaMatProhibidos;
    }
    public void setListaMatProhibidos(HashSet<String> listaMatProhibidos) {
        this.listaMatProhibidos = listaMatProhibidos;
    }

    public Aprendiz(String nombre, String apellido, LocalDate fechaNac, String aldeaOrigen, Taller taller, HashSet<String> listaMatProhibidos) {
        super(nombre, apellido, fechaNac, aldeaOrigen, taller);
        this.listaMatProhibidos = listaMatProhibidos;
    }


    @Override
    public String prepararEstacionTrabajo() {
        return "Ya guarde los materiales peligrosos y la cantidad de los prohibidos es " + listaMatProhibidos.size();
    }
}
