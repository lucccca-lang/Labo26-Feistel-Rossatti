package webCompus;

public class Tarjeta extends MetodoPago{
    private int numero;
    private String banco;
    private String cred_o_debito;

    public float recargo(){
        return 0.05F;
    }

}
