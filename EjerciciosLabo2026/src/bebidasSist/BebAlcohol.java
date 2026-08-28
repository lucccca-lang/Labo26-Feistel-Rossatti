package bebidasSist;

public class BebAlcohol extends Bebida {
    private int cantAlcohol;

    public int getCantAlcohol() {
        return cantAlcohol;
    }
    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    public BebAlcohol(String nombre, int cantAlcohol) {
        super(nombre, 0, cantAlcohol*20);
        this.cantAlcohol = cantAlcohol;
    }
}
