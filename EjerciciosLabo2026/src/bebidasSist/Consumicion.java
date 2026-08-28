package bebidasSist;

public class Consumicion {
    private Bebida bebida;
    private int cantidad;

    public Bebida getBebida() {
        return bebida;
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Consumicion(Bebida bebida, int cantidad) {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public int hidratatacion(){
        return cantidad * bebida.coefHidratacion();
    }


}
