package vehiculos;

public enum Color {
    ROJO("#FF0000"), BLANCO("#FFFFFF"), NEGRO("#000000");

    private String hexa;

    private Color(String hexa) {
        this.hexa = hexa;
    }

    public String getHexa() {
        return hexa;
    }


}
