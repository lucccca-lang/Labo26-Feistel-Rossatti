package negocioJuliMigue;

public class Bizcochuelo extends Preparacion{
    private int cantLimon;
    private int cantPolvoHornear;

    public int getCantLimon() {
        return cantLimon;
    }
    public void setCantLimon(int cantLimon) {
        this.cantLimon = cantLimon;
    }
    public int getCantPolvoHornear() {
        return cantPolvoHornear;
    }
    public void setCantPolvoHornear(int cantPolvoHornear) {
        this.cantPolvoHornear = cantPolvoHornear;
    }

    public Bizcochuelo(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, int precio, int cantLimon, int cantPolvoHornear) {
        super(cantHarina, cantAzucar, cantManteca, cantHuevos, stock, precio);
        this.cantLimon = cantLimon;
        this.cantPolvoHornear = cantPolvoHornear;
    }

    @Override
    public String conocerReceta() {
        return "El bizcochuelo arranca con...";
    }
}
