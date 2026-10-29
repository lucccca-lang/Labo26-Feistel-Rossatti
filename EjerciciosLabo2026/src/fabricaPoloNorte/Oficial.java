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
    public void prepararEstacionTrabajo() {
        HashSet<String> listaMaterialesMayorUno = new HashSet<>();

        for (Map.Entry<String, Integer> lista : listaStockMateriales.entrySet()){
            if(lista.getValue() > 1){
                listaMaterialesMayorUno.add(lista.getKey());
            }
        }
        System.out.println("Estos son los materiales cuyo stock es mayor a 1 " + listaMaterialesMayorUno);
    }

    @Override
    public void fabricar(Regalo reg, String material) throws ExcedioElTiempoDispoException, NoTieneMaterialesNecesariosException, UsoDeMaterialProhibidoException, RegaloNoLePerteneceException {
        if(!(reg.getTamanio().equals(Tamanio.MEDIANO))){
            throw new RegaloNoLePerteneceException("El regalo " + reg.getNombre() + "no le pertenece");
        }
        else if(!(listaStockMateriales.containsKey(material) && listaStockMateriales.get(material) > 1)){
            throw new NoTieneMaterialesNecesariosException("Operacion parada, no tiene los materiales necesarios");
        }
        System.out.println("El regalo " + reg.getNombre() + " fue fabricado con exito");
    }


}
