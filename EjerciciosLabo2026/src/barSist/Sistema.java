package barSist;

import java.util.HashSet;

public class Sistema {
    private HashSet<Bar> listaBares;
    private HashSet<Diana> listaDianas;
    private HashSet<Beneficio> listaBeneficios;

    public Sistema(HashSet<Bar> listaBares, HashSet<Diana> listaDianas, HashSet<Beneficio> listaBeneficios) {
        this.listaBares = listaBares;
        this.listaDianas = listaDianas;
        this.listaBeneficios = listaBeneficios;
    }

    public Diana masCantPuntajesDistintos(){
        Diana dianaMasPunt = null;
        for (Diana diana : listaDianas){
            if(dianaMasPunt == null || diana.cantPuntaje() > dianaMasPunt.cantPuntaje()){
                dianaMasPunt = diana;
            }
        }
        return dianaMasPunt;
    }
}
