package barSist;

import java.util.HashSet;

public class Sistema {
    private HashSet<Bar> listaBares;
    private HashSet<Diana> listaDianas;
    private HashSet<Beneficio> listaBeneficios;

    public Diana masCantPuntajesDistintos(){
        Diana dianaMasPunt = null;
        for (Diana diana : listaDianas){
            if(diana.getListaPuntajeFranja().size() > dianaMasPunt.getListaPuntajeFranja().size()){
                dianaMasPunt = diana;
            }
        }
        return dianaMasPunt;
    }
}
