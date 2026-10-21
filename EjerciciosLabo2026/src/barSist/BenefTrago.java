package barSist;

import java.util.HashSet;

public class BenefTrago extends Beneficio{
    private HashSet<String> listaTragos;

    public HashSet<String> getListaTragos() {
        return listaTragos;
    }
    public void setListaTragos(HashSet<String> listaTragos) {
        this.listaTragos = listaTragos;
    }

    public BenefTrago(String nombreBenef, String usuarioCreador, HashSet<String> listaTragos) {
        super(nombreBenef, usuarioCreador);
        this.listaTragos = listaTragos;
    }

    public void agregarTrago (String trago){
        listaTragos.add(trago);
    }
}
