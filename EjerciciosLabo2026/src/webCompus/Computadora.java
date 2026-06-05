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

    public boolean ComputadoraValida() {
        int cantCpu = 0;
        int cantDispEntrada = 0;
        int cantDispSalida = 0;

        for (Componente comps : componentes) {
            cantDispEntrada += comps.EsDispEntrada();
            cantDispSalida += comps.EsDispSalida();
            cantCpu += comps.EsCpu();
        }
        if (cantCpu > 0 && cantDispEntrada > 0 && cantDispSalida > 0) {
            return true;
        }
        return false;

    }

    public float calcularPrecio(){
        float total = 0;

        for(Componente componente : componentes){
            total += componente.getPrecioVenta();
        }

        return total;

    }

    public String detalleComponentes(){
        String detalle = "";

        for (Componente componente : componentes){
            detalle += "- " + componente.getModelo() + " " + componente.getPrecioVenta() + '\n';
        }

        return detalle;
    }

    public String contarDispositivos() {
        int cantEntrada = 0;
        int cantSalida = 0;

        for (Componente componente : componentes) {
            cantSalida += componente.EsDispSalida();
            cantEntrada += componente.EsDispEntrada();

        }

        return "Salida: " + cantSalida + '\n' + "Entrada: " + cantEntrada;
    }

}
