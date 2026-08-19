package appRecetas;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato {
    private int tiempoCoccion;
    private int cantComensales;

    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> listaPasos, int tiempoCoccion, int cantComensales) {
        super(nombre, dificultad, listaPasos);
        this.tiempoCoccion = tiempoCoccion;
        this.cantComensales = cantComensales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }
    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }
    public int getCantComensales() {
        return cantComensales;
    }
    public void setCantComensales(int cantComensales) {
        this.cantComensales = cantComensales;
    }


    @Override
    public boolean esDeTipo(Tipo tipo) {
        return tipo == Tipo.PLATO_PRINCIPAL;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Esta receta tarda en cocinarse " + this.tiempoCoccion + " y los pasos son : " + getListaPasos());
    }

    static void main() {
        Entrada e1 = new Entrada("aaa", Dificultad.FACIL, new ArrayList<>());

        System.out.println(e1);
    }
}
