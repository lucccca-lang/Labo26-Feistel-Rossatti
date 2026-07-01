package webCompus;

public class Efectivo extends MetodoPago{
    @Override
    public float recargo() {
        return 0;
    }

    public String metodo() {
        return "Efectivo";
    }
}
