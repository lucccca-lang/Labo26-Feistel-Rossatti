package orgPoliticas;

import seresVivos.Persona;

public class Trabajador extends Persona implements Campanias{
    private int numCuil, sueldo;
    private String Direccion;
    private boolean horarioLaboral;

    public Trabajador(String nombre, int DNI, String apellido, int numCuil, int sueldo, String direccion) {
        super(nombre, DNI, apellido);
        this.numCuil = numCuil;
        this.sueldo = sueldo;
        Direccion = direccion;
    }



    @Override
    public void enviarMensajeDirigente() throws NoSePuedeEnviarException {
        if(horarioLaboral){
            System.out.println("Yo," + getNombre() + "te invito a que… Vote por el partido para un mejor futuro");}
        else{
            throw new NoSePuedeEnviarException("No se puede enviar porque no esta en su horario laboral");
        }
    }
}

/*
    EN MAIN
        try{
            enviarMensajeDirigente();
        }
        catch (NoSePuedeEnviarException e){
            System.out.println(e.getMessage());        }
    */