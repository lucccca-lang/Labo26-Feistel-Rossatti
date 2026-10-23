package fundacionEndo;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    HashMap<PorTratar, Integer> listaPacientesCalificados;
    HashSet<Paciente> listaPacientes;

    public Sistema(HashMap<PorTratar, Integer> listaPacientesCalificados, HashSet<Paciente> listaPacientes) {
        this.listaPacientesCalificados = listaPacientesCalificados;
        this.listaPacientes = listaPacientes;
    }

    public void avanzarTratamiento(PorTratar paciente){
        if(listaPacientesCalificados.containsKey(paciente)){
            listaPacientesCalificados.put(paciente, listaPacientesCalificados.get(paciente) + 1);
        }
        else {
            if (paciente.verificar()){
                listaPacientesCalificados.put(paciente, 1);
            }
        }
    }

    /*public int cantPacNoAplicados (){
        int cant = 0;
        for (Paciente p: listaPacientes){
            if(!(p instanceof PorTratar)){
                cant ++;
            }
        }
        return cant;
    }*/

    public int cantPacNoAplicados (){
        return this.listaPacientes.size() - this.listaPacientesCalificados.size();
    }
}
