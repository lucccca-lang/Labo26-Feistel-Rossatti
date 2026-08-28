package bebidasSist;

public class BebAzucar extends Bebida {
    private int cantAzucar;

    public int getCantAzucar() {
        return cantAzucar;
    }
    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public BebAzucar(String nombre, int cantAzucar) {
        super(nombre, 1, cantAzucar*10);
        this.cantAzucar = cantAzucar;
    }
}
