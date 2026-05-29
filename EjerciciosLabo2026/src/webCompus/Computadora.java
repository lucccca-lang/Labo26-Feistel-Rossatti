package webCompus;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente> componentes;
    private int precioTotal;

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }
    public int getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean ComputadoraValida(){
        int cantCpu = 0;
        int cantDispEntrada = 0;
        int cantDispSalida = 0;

        for (Componente comps : componentes) {
            cantDispEntrada += comps.EsDispEntrada();
            cantDispSalida += comps.EsDispSalida();
            cantCpu += comps.EsCpu();
        }
            if(cantCpu > 0 && cantDispEntrada > 0 && cantDispSalida > 0){
                return true;
            }
            return false;
        }
    }
}
