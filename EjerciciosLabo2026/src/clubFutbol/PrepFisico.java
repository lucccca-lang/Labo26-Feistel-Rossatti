package clubFutbol;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class PrepFisico extends CuerpoTecnico{
    private String especialidad;
    private boolean matricula;

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public boolean isMatricula() {
        return matricula;
    }
    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public PrepFisico(String nombre, LocalDate fechaNac, HashMap<String, Integer> listaHistorialClubes, String tituloProf, int aniosExp, String especialidad, boolean matricula) {
        super(nombre, fechaNac, listaHistorialClubes, tituloProf, aniosExp);
        this.especialidad = especialidad;
        this.matricula = matricula;
    }

    @Override
    public boolean requisitos() throws NoCumpleRequisitosExcepetion {
        try{
            if(!(this.matricula && super.getAniosExp() > 2)){
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
            if(!this.matricula){
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
                "especialidad='" + especialidad + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
