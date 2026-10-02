package bibliotecaVirtual;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);

    private int limiteLibro;

    Membresia(int limiteLibro) {
        this.limiteLibro = limiteLibro;
    }

    public int getLimiteLibro() {
        return limiteLibro;
    }
}
