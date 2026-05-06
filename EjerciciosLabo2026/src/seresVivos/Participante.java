package seresVivos;

import java.time.LocalDate;

public class Participante extends Persona {

    private  int numeroCamiseta;

    public Participante(int numeroCamiseta, LocalDate fechaNac, String apellido, String nombre,String direccion) {
        super(nombre,apellido,direccion,fechaNac);
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}

