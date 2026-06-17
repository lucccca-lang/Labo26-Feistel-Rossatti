package arte;

public enum EstadoCuadro {
    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10);

    private int estado;

    private EstadoCuadro(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
}
