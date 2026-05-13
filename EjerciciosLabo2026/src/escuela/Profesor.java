package escuela;

import seresVivos.Persona;

public class Profesor extends Persona {
    private int porcDescuento;

    public int getPorcDescuento() {
        return porcDescuento;
    }
    public void setPorcDescuento(int porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
        porcDescuento = 50;
    }
}
