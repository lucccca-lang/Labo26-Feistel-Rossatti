package barSist;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> listaDianasUtilizadas;
    private int cantClientesJuegan;
    private int dineroRecaudado;
    private HashSet<Beneficio> listaBenefImplementados;
    private HashSet<BenefAcumulable> listaBenefAcumulables;

    public HashSet<Diana> getListaDianasUtilizadas() {
        return listaDianasUtilizadas;
    }
    public void setListaDianasUtilizadas(HashSet<Diana> listaDianasUtilizadas) {
        this.listaDianasUtilizadas = listaDianasUtilizadas;
    }
    public int getCantClientesJuegan() {
        return cantClientesJuegan;
    }
    public void setCantClientesJuegan(int cantClientesJuegan) {
        this.cantClientesJuegan = cantClientesJuegan;
    }
    public int getDineroRecaudado() {
        return dineroRecaudado;
    }
    public void setDineroRecaudado(int dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }
    public HashSet<BenefAcumulable> getListaBenefAcumulables() {
        return listaBenefAcumulables;
    }
    public void setListaBenefAcumulables(HashSet<BenefAcumulable> listaBenefAcumulables) {
        this.listaBenefAcumulables = listaBenefAcumulables;
    }
    public HashSet<Beneficio> getListaBenefImplementados() {
        return listaBenefImplementados;
    }
    public void setListaBenefImplementados(HashSet<Beneficio> listaBenefImplementados) {
        this.listaBenefImplementados = listaBenefImplementados;
    }

    public Bar(HashSet<Diana> listaDianasUtilizadas, int cantClientesJuegan, int dineroRecaudado, HashSet<Beneficio> listaBenefImplementados, HashSet<BenefAcumulable> listaBenefAcumulables) {
        this.listaDianasUtilizadas = listaDianasUtilizadas;
        this.cantClientesJuegan = cantClientesJuegan;
        this.dineroRecaudado = dineroRecaudado;
        this.listaBenefImplementados = listaBenefImplementados;
        this.listaBenefAcumulables = listaBenefAcumulables;
    }


    public in
    t cantBenefTragos(){
        HashSet<BenefTrago> listaBenefTragos = new HashSet<>();

        for(Beneficio benef : listaBenefImplementados) {
            if (!(benef instanceof BenefAcumulable)) {
                listaBenefTragos.add((BenefTrago) benef);                       //castea e instance of para especificar
            }
        }
        return listaBenefTragos.size();
    }


}
