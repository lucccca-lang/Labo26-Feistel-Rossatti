package orgPoliticas;

import seresVivos.Persona;

public class Trabajador extends Persona implements Campanias{
    private int numCuil, sueldo;
    private String Direccion;

    public Trabajador(String nombre, int DNI, String apellido, int numCuil, int sueldo, String direccion) {
        super(nombre, DNI, apellido);
        this.numCuil = numCuil;
        this.sueldo = sueldo;
        Direccion = direccion;
    }



    @Override
    public void enviarMensajeDirigente() {

    }
}
