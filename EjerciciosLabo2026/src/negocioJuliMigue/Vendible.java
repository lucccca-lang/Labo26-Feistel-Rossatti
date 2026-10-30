package negocioJuliMigue;

public interface Vendible {

    boolean actualizarStock(int cantRequerida);
    String descripcionVenta();
    int calcularPrecio(int cantRequerida);
    void vender(int cantRequerida);


}
