package orgPoliticas;

import java.util.HashSet;

public class PartidoPol {
    private String nombre, direccionOfCentral;
    private int cantAfiliados;
    private HashSet<Campanias> listaEnviaMensajes;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccionOfCentral() {
        return direccionOfCentral;
    }
    public void setDireccionOfCentral(String direccionOfCentral) {
        this.direccionOfCentral = direccionOfCentral;
    }
    public int getCantAfiliados() {
        return cantAfiliados;
    }
    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }
    public HashSet<Campanias> getListaEnviaMensajes() {
        return listaEnviaMensajes;
    }
    public void setListaEnviaMensajes(HashSet<Campanias> listaEnviaMensajes) {
        this.listaEnviaMensajes = listaEnviaMensajes;
    }


    public void agregarMensajero(Campanias mensajero){
        if(!this.listaEnviaMensajes.contains(mensajero)) {
            this.listaEnviaMensajes.add(mensajero);
        }
        else {
            System.out.println("El mensajero ya esta afiliado");
        }
    }

    public void hacerCampania(){
        for(Campanias c : listaEnviaMensajes){
            c.enviarMensajeDirigente();
            System.out.println("Vote por el partido para un mejor futuro");

        }
    }
}
