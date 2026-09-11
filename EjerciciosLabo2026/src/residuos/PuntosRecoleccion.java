package residuos;

import java.util.HashMap;
import java.util.HashSet;

public class PuntosRecoleccion {
    private String direccion;
    private int latitud;
    private int longitud;
    private String barrio;
    private String nombre;
    private HashMap<TipoResiduo,Integer> listaResiduos;

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getLatitud() {
        return latitud;
    }
    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public HashMap<TipoResiduo, Integer> getListaResiduos() {
        return listaResiduos;
    }
    public void setListaResiduos(HashMap<TipoResiduo, Integer> listaResiduos) {
        this.listaResiduos = listaResiduos;
    }

    public PuntosRecoleccion(String direccion, int latitud, int longitud, String barrio, String nombre, HashMap<TipoResiduo, Integer> listaResiduos) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.barrio = barrio;
        this.nombre = nombre;
        this.listaResiduos = listaResiduos;
    }




}
