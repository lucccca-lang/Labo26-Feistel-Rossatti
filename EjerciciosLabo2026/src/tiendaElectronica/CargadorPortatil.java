package tiendaElectronica;

public class CargadorPortatil extends Producto{
    private int cantCargas;

    public CargadorPortatil(String nombre, float precio, int stock, int cantCargas) {
        super(nombre, precio, stock, Seccion.CARGADOR);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() {
        return cantCargas;
    }
    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}
