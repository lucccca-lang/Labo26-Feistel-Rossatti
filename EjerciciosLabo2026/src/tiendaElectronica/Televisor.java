package tiendaElectronica;

public class Televisor extends Producto{
    private Tecnologia tecnologia;
    private int resolucion;

    public Televisor(String nombre, float precio, int stock, Tecnologia tecnologia, int resolucion) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }
    public int getResolucion() {
        return resolucion;
    }
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
