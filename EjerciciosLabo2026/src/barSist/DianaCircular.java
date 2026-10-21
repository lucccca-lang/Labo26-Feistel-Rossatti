package barSist;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private static int radio = 13;

    public static int getRadio() {
        return radio;
    }
    public static void setRadio(int radio) {
        DianaCircular.radio = radio;
    }

    public DianaCircular(String nombre, String nivelDificultad, HashMap<Integer, ColorFranja> listaPuntajeFranja) {
        super(nombre, nivelDificultad, listaPuntajeFranja);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio ;
    }
}
