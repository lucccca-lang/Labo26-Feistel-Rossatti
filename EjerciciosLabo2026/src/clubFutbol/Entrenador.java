package clubFutbol;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Entrenador extends CuerpoTecnico {
    private int cantCampeonatosObt;
    private boolean licenciaProfVigente;


    public int getCantCampeonatosObt() {
        return cantCampeonatosObt;
    }
    public void setCantCampeonatosObt(int cantCampeonatosObt) {
        this.cantCampeonatosObt = cantCampeonatosObt;
    }
    public boolean isLicenciaProfVigente() {
        return licenciaProfVigente;
    }
    public void setLicenciaProfVigente(boolean licenciaProfVigente) {
        this.licenciaProfVigente = licenciaProfVigente;
    }

    public Entrenador(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes, String tituloProf, int aniosExp, int cantCampeonatosObt, boolean licenciaProfVigente) {
        super(nombre, fechaNac, listaHistorialClubes, tituloProf, aniosExp);
        this.cantCampeonatosObt = cantCampeonatosObt;
        this.licenciaProfVigente = licenciaProfVigente;
    }

    @Override
    public boolean requisitos() throws NoCumpleRequisitosExcepetion {
        try{
            if(!(this.licenciaProfVigente && super.getAniosExp() > 3)){
                throw new NoCumpleRequisitosExcepetion("No cumple los requisitos");
            }
            return false;
        }
        catch (NoCumpleRequisitosExcepetion e){
            System.out.println(e.getMessage());
            return true;
        }
    }

    @Override
    public boolean reqRenovacion(){
        try{
            if(!this.licenciaProfVigente){
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
        return super.getTituloProf()+ super.getAniosExp() +
                "Entrenador{" +
                "cantCampeonatosObt=" + cantCampeonatosObt +
                ", licenciaProfVigente=" + licenciaProfVigente +
                '}';
    }
}
