package clubFutbol;

import java.util.HashSet;

public class Club {
    private String nombre;
    private HashSet<Integrante> listaIntegrantesAceptados;

    public void contratar(Integrante persona) throws NoCumpleRequisitosExcepetion, YaTrabajoAcaException {
        persona.requisitos();
        if (persona.getListaHistorialClubes().containsKey(this.nombre)){
            throw new YaTrabajoAcaException("Ya estuvo en este club");
        }
        else {
            this.listaIntegrantesAceptados.add(persona);
            persona.getListaHistorialClubes().put(this.nombre,persona.getListaHistorialClubes().get(this.nombre) + 1);
            System.out.println(persona.getNombre() + " fue contratado por " + this.nombre);
        }
    }


    public void renovar(Integrante persona) throws NoCumpleRenovacionException{
        if (persona.getListaHistorialClubes().containsKey(this.nombre) && persona.reqRenovacion()){
            persona.getListaHistorialClubes().put(this.nombre,persona.getListaHistorialClubes().get(this.nombre) + 1);
            System.out.println(persona.getNombre() + " renovo su contrato con " + this.nombre);
        }
        else{
            throw new NoCumpleRenovacionException("No cumple los requisitos de la renovacion");
        }
    }

    public void mostrarInfoContratada(){
        for(Integrante pers : listaIntegrantesAceptados){
            pers.toString();
        }
    }

}
