package fundacionEndo;

public enum NivelTolerancia {
    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10);

    private int nivel;

    public int getNivel() {
        return nivel;
    }

    NivelTolerancia(int nivel) {
        this.nivel = nivel;
    }
}
