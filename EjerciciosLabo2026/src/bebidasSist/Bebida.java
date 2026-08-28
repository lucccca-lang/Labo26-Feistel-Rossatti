package bebidasSist;

public class Bebida {
    private String nombre;
    private int coefPos;
    private int coefNeg;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCoefPos() {
        return coefPos;
    }
    public void setCoefPos(int coefPos) {
        this.coefPos = coefPos;
    }
    public int getCoefNeg() {
        return coefNeg;
    }
    public void setCoefNeg(int coefNeg) {
        this.coefNeg = coefNeg;
    }

    public Bebida(String nombre, int coefPos, int coefNeg) {
        this.nombre = nombre;
        this.coefPos = coefPos;
        this.coefNeg = coefNeg;
    }

    public int coefHidratacion(){
        return this.coefPos - this.coefNeg;
    }
}
