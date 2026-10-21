package barSist;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private String nivelDificultad;
    private HashMap<Integer, ColorFranja> listaPuntajeFranja;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNivelDificultad() {
        return nivelDificultad;
    }
    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    public HashMap<Integer, ColorFranja> getListaPuntajeFranja() {
        return listaPuntajeFranja;
    }
    public void setListaPuntajeFranja(HashMap<Integer, ColorFranja> listaPuntajeFranja) {
        this.listaPuntajeFranja = listaPuntajeFranja;
    }

    public Diana(String nombre, String nivelDificultad, HashMap<Integer, ColorFranja> listaPuntajeFranja) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.listaPuntajeFranja = listaPuntajeFranja;
    }

    public abstract double calcularArea();
}
