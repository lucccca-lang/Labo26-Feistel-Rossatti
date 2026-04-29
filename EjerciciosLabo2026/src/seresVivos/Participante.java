package seresVivos;

import java.time.LocalDate;

public class Participante extends Persona {
    private String apellido;
    private  int numeroCamiseta;

    public Participante(int numeroCamiseta, LocalDate fechaNac, String apellido, String nombre,String direccion) {
        super(nombre,apellido,direccion,fechaNac);
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return super.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return super.fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}