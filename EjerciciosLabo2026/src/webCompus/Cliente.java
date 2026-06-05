package webCompus;

import seresVivos.Persona;

public class Cliente extends Persona {

    public Cliente(String nombre, String apellido, int numCelular) {
        super(nombre, apellido, numCelular);
    }



    public void mostrarDetalles(){
        datosPersona();
    }

    public String datosCliente(){
        return "El nombre es " + getNombre() + ", su edad es " + getEdad() + " y su numero de celular es " + getNumCelular();
    }
}
