package barSist;

import java.util.HashMap;

public class DianaRectangular extends Diana{
    private int altura;
    private int base;

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public DianaRectangular(String nombre, String nivelDificultad, HashMap<Integer, ColorFranja> listaPuntajeFranja, int altura, int base) {
        super(nombre, nivelDificultad, listaPuntajeFranja);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
