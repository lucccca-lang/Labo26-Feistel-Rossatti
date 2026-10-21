package clubFutbol;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class DeCampo extends Jugador{
    private int porcGolesConvert;
    private int cantAsist;

    public int getPorcGolesConvert() {
        return porcGolesConvert;
    }
    public void setPorcGolesConvert(int porcGolesConvert) {
        this.porcGolesConvert = porcGolesConvert;
    }
    public int getCantAsist() {
        return cantAsist;
    }
    public void setCantAsist(int cantAsist) {
        this.cantAsist = cantAsist;
    }

    public DeCampo(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes, String provOrigen, Posicion posicion, HashSet<String> listaHistorialClubes1, int numCamiseta, int porcGolesConvert, int cantAsist) {
        super(nombre, fechaNac, listaHistorialClubes, provOrigen, posicion, listaHistorialClubes1, numCamiseta);
        this.porcGolesConvert = porcGolesConvert;
        this.cantAsist = cantAsist;
    }

    @Override
    public boolean requisitos()  {
        try{
            if(!(this.porcGolesConvert > 30 && this.cantAsist > 10)){
                throw new NoCumpleRequisitosExcepetion("No cumple con los requisitos");
            }
            return true;
        }
        catch (NoCumpleRequisitosExcepetion e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean reqRenovacion(){
        try{
            if(super.getEdad() > 35){
                throw new NoCumpleRenovacionException("No cumple requisitos pedidos");
            }
            return true;
        } catch (NoCumpleRenovacionException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return super.getNombre() +
                "porcGolesConvert=" + porcGolesConvert +
                ", cantAsist=" + cantAsist +
                '}';
    }
}