package fabricaPoloNorte;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Oficial extends Ayudante{
    private HashMap<String, Integer> listaStockMateriales;

    public HashMap<String, Integer> getListaStockMateriales() {
        return listaStockMateriales;
    }
    public void setListaStockMateriales(HashMap<String, Integer> listaStockMateriales) {
        this.listaStockMateriales = listaStockMateriales;
    }

    public Oficial(String nombre, String apellido, LocalDate fechaNac, String aldeaOrigen, Taller taller, HashMap<String, Integer> listaStockMateriales) {
        super(nombre, apellido, fechaNac, aldeaOrigen, taller);
        this.listaStockMateriales = listaStockMateriales;
    }


    @Override
    public String prepararEstacionTrabajo() {
        HashSet<String> listaMaterialesMayorUno = new HashSet<>();

        for (Map.Entry<String, Integer> lista : listaStockMateriales.entrySet()){
            if(lista.getValue() > 1){
                listaMaterialesMayorUno.add(lista.getKey());
            }
        }
        return "Estos son los materiales cuyo stock es mayor a 1 " + this.listaStockMateriales;
    }
}
