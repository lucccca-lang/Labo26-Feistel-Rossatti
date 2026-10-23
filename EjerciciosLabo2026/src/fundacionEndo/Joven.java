package fundacionEndo;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements PorTratar{
    private static int edadMin = 20;
    private static int edadMax = 30;
    private HashSet<String> listaActDepor;
    private static TipoSangre objSangre = TipoSangre.A_POS;


    public static int getEdadMin() {
        return edadMin;
    }
    public static void setEdadMin(int edadMin) {
        Joven.edadMin = edadMin;
    }
    public static int getEdadMax() {
        return edadMax;
    }
    public static void setEdadMax(int edadMax) {
        Joven.edadMax = edadMax;
    }
    public HashSet<String> getListaActDepor() {
        return listaActDepor;
    }
    public void setListaActDepor(HashSet<String> listaActDepor) {
        this.listaActDepor = listaActDepor;
    }

    public Joven(String nombre, String apellido, LocalDate fechaNac, String genero, TipoSangre tipoSangre, HashSet<String> listaActDepor) {
        super(nombre, apellido, fechaNac, genero, tipoSangre);
        this.listaActDepor = listaActDepor;
    }

    @Override
    public boolean verificar(){
        if(this.listaActDepor.size() % 2 == 1 && super.getFechaNac().getYear() >= 1998){
            return false;
        }
        return true;
    }



    @Override
    public String solicitarTratamiento() {
        String msj = null;
        if(verificar()){
            msj = "Lamentamos comunicarte que tu sangre aún no va a poder ser modificada";
        }
        else{
            msj = "Será un tratamiento costoso, pero lo vamos a lograr";
        }
            return msj;
    }

    @Override
    public int solicitarCostoTratamiento() {
        int costo;
        if(super.getFechaNac().getYear() % 2 == 1){
            costo = super.getFechaNac().getMonthValue() * 760000;
        }
        else {
            costo = super.getFechaNac().getDayOfMonth() * 145500;
        }
        return costo;
    }

}
