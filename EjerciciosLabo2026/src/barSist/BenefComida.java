package barSist;

import java.util.HashSet;

public class BenefComida extends Beneficio implements BenefAcumulable{
    private HashSet<String> listaComidas;

    public HashSet<String> getListaComidas() {
        return listaComidas;
    }
    public void setListaComidas(HashSet<String> listaComidas) {
        this.listaComidas = listaComidas;
    }

    public BenefComida(String nombreBenef, String usuarioCreador, HashSet<String> listaComidas) {
        super(nombreBenef, usuarioCreador);
        this.listaComidas = listaComidas;
    }

    @Override
    public int calcularDescuentoExtra() {
        return 4500;
    }
}
