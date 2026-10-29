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
    public void prepararEstacionTrabajo() {
        System.out.println("Ya guarde los materiales peligrosos y la cantidad de los prohibidos es " + listaMatProhibidos.size());
    }

    @Override
    public void fabricar(Regalo reg, String material) throws ExcedioElTiempoDispoException, NoTieneMaterialesNecesariosException, UsoDeMaterialProhibidoException, RegaloNoLePerteneceException {
        if(!(reg.getTamanio().equals(Tamanio.PEQUENIO))){
            throw new RegaloNoLePerteneceException("El regalo " + reg.getNombre() + "no le pertenece");
        }
        else if (listaMatProhibidos.contains(material)){
            throw new UsoDeMaterialProhibidoException("Operacion parada, esta usando un material prohibido");
        }
        System.out.println("El regalo " + reg.getNombre() + " fue fabricado con exito");
    }


}
