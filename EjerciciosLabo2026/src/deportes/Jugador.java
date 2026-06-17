package deportes;
import seresVivos.Persona;

import java.time.LocalDate;

public class Jugador extends Persona {

    private int numero_de_camiseta;

    public Jugador(String nombre, String apellido, LocalDate fechaNac, int numero_de_camiseta) {
        super(nombre, apellido, fechaNac);
        this.numero_de_camiseta = numero_de_camiseta;
    }

    public int getNumero_de_camiseta() {
        return numero_de_camiseta;
    }

    public void setNumero_de_camiseta(int numero_de_camiseta) {
        this.numero_de_camiseta = numero_de_camiseta;
    }


}