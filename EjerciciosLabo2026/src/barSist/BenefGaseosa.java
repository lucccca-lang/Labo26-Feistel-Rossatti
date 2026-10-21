package barSist;

import java.util.HashSet;

public class BenefGaseosa extends Beneficio implements BenefAcumulable{
    private HashSet<String> listaGaseosas;

    public HashSet<String> getListaGaseosas() {
        return listaGaseosas;
    }
    public void setListaGaseosas(HashSet<String> listaGaseosas) {
        this.listaGaseosas = listaGaseosas;
    }

    public BenefGaseosa(String nombreBenef, String usuarioCreador, HashSet<String> listaGaseosas) {
        super(nombreBenef, usuarioCreador);
        this.listaGaseosas = listaGaseosas;
    }

    @Override
    public int calcularDescuentoExtra() {
        return 1000;
    }
}
