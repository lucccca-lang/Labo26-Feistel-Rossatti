package fabricaPoloNorte;

import seresVivos.Persona;

import java.time.LocalDate;

public abstract class Ayudante extends Persona {
    private String aldeaOrigen;
    private Taller taller;

    public String getAldeaOrigen() {
        return aldeaOrigen;
    }
    public void setAldeaOrigen(String aldeaOrigen) {
        this.aldeaOrigen = aldeaOrigen;
    }
    public Taller getTaller() {
        return taller;
    }
    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public Ayudante(String nombre, String apellido, LocalDate fechaNac, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNac);
        this.aldeaOrigen = aldeaOrigen;
        this.taller = taller;
    }

    public abstract void prepararEstacionTrabajo();

    public abstract void fabricar(Regalo reg, String material) throws ExcedioElTiempoDispoException,
            NoTieneMaterialesNecesariosException, UsoDeMaterialProhibidoException, RegaloNoLePerteneceException;

}
