package escuela;

import appRecetas.Dificultad;

import java.util.ArrayList;

public class Plato {
    private String nombre;
    private double precio;


    public double getPrecio() {
        return precio;
    }
    public double setPrecio(double precio) {
        this.precio = precio;
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


}
