package barSist;

import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private int lado;

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public DianaCuadrada(String nombre, String nivelDificultad, HashMap<Integer, ColorFranja> listaPuntajeFranja, int lado) {
        super(nombre, nivelDificultad, listaPuntajeFranja);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
