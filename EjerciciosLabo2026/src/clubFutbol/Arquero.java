package clubFutbol;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Arquero extends Jugador{

    private int porcAtajadas;
    private int cantGolesRecib;

    public int getPorcAtajadas() {
        return porcAtajadas;
    }
    public void setPorcAtajadas(int porcAtajadas) {
        this.porcAtajadas = porcAtajadas;
    }
    public int getCantGolesRecib() {
        return cantGolesRecib;
    }
    public void setCantGolesRecib(int cantGolesRecib) {
        this.cantGolesRecib = cantGolesRecib;
    }

    public Arquero(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes, String provOrigen, HashSet<String> listaHistorialClubes1, int numCamiseta, int porcAtajadas, int cantGolesRecib) {
        super(nombre, fechaNac, listaHistorialClubes, provOrigen, Posicion.ARQUERO, listaHistorialClubes1, numCamiseta);
        this.porcAtajadas = porcAtajadas;
        this.cantGolesRecib = cantGolesRecib;
    }

    @Override
    public boolean requisitos(){
       try{
           if(!(this.porcAtajadas > 60 && this.cantGolesRecib < 10)){
               throw new NoCumpleRequisitosExcepetion("no cumple con requisitos");
           }
           return true;
       }
       catch(NoCumpleRequisitosExcepetion e) {
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
                "porcAtajadas=" + porcAtajadas +
                ", cantGolesRecib=" + cantGolesRecib +
                '}';
    }
}



