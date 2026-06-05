package webCompus;

public class Tarjeta extends MetodoPago{
    private int numero;
    private String banco;
    private CredDeb cred_o_debito;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public CredDeb getCred_o_debito() {
        return cred_o_debito;
    }
    public void setCred_o_debito(CredDeb cred_o_debito) {
        this.cred_o_debito = cred_o_debito;
    }

    public float recargo(){
        return 0.05F;
    }

    public String metodo() {
        return "Tipo: " + cred_o_debito+ '\n' +
                "numero tarjeta: " + numero +'\n'
                + "Banco: " + banco+ '\n';
    }
}
