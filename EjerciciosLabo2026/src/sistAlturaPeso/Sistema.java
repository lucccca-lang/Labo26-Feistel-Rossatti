package sistAlturaPeso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Paciente> listaPaciente;

    public void nuevaMedicion (Paciente paciente, Medicion medicion){
        if (paciente.getMedicion().containsKey(LocalDate.now())){
            System.out.println("En esta fecha ya existe una medicion");
        }
        else{
            paciente.getMedicion().put(LocalDate.now(), medicion);
        }
    }
}
