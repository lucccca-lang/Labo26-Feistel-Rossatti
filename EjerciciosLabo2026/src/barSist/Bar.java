package barSist;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> listaDianasUtilizadas;
    private int cantClientesJuegan;
    private int dineroRecaudado;
    private HashSet<Beneficio> listaBenefImplementados;
    private HashSet<BenefAcumulable> listaBenefAcumulables;

    public Bar(HashSet<Diana> listaDianasUtilizadas, int cantClientesJuegan, int dineroRecaudado, HashSet<Beneficio> listaBenefImplementados, HashSet<BenefAcumulable> listaBenefAcumulables) {
        this.listaDianasUtilizadas = listaDianasUtilizadas;
        this.cantClientesJuegan = cantClientesJuegan;
        this.dineroRecaudado = dineroRecaudado;
        this.listaBenefImplementados = listaBenefImplementados;
        this.listaBenefAcumulables = listaBenefAcumulables;
    }

    public Bar() {
    }

    public void agregarDiana(Diana diana){
        listaDianasUtilizadas.add(diana);
    }

    public int cantBenefTragos(){
        HashSet<BenefTrago> listaBenefTragos = new HashSet<>();

        for(Beneficio benef : listaBenefImplementados) {
            if (!(benef instanceof BenefAcumulable)) {
                listaBenefTragos.add((BenefTrago) benef);                       //castea e instance of para especificar
            }
        }
        return listaBenefTragos.size();
    }


}
