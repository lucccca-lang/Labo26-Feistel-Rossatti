package residuos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<TipoResiduo> listaTipoResiduo;
    private HashSet<PuntosRecoleccion> listaPuntosRecoleccion;
    private HashSet<Camion> listaCamion;

    public void registrarNuevoTipo (TipoResiduo tipoRes){
        listaTipoResiduo.add(tipoRes);
    }

    public void modificarTipo(TipoResiduo tipoRes, TipoResiduo tipoResNuevo) {
        if (listaTipoResiduo.contains(tipoRes)) {
            listaTipoResiduo.remove(tipoRes);
            listaTipoResiduo.add(tipoResNuevo);
        } else {
            System.out.println("El tipo de residuo no existe");
        }
    }

    public HashSet<TipoResiduo> consultarReciclables (){
        HashSet<TipoResiduo> listaTipoResRespuesta = new HashSet<>();

        for (TipoResiduo tipoRes : listaTipoResiduo){
            if(tipoRes.isEsReciclable()){
                listaTipoResRespuesta.add(tipoRes);
            }
        }
        return listaTipoResRespuesta;
    }

    public HashSet<TipoResiduo> consultarNoReciclables (){
        HashSet<TipoResiduo> listaTipoResRespuesta = new HashSet<>();

        for (TipoResiduo tipoRes : listaTipoResiduo){
            if(!tipoRes.isEsReciclable()){
                listaTipoResRespuesta.add(tipoRes);
            }
        }
        return listaTipoResRespuesta;
    }

    public PuntosRecoleccion buscarPorDireccion (String direccion){
        PuntosRecoleccion p1 = null;
        for (PuntosRecoleccion puntoRec : listaPuntosRecoleccion){
            if(puntoRec.getDireccion().equals(direccion)){
                p1 = puntoRec;
            }
        }
        return p1;
    }

    public void agregarPuntoRecoleccion (PuntosRecoleccion puntoRec){
        listaPuntosRecoleccion.add(puntoRec);
    }

    public void eliminarPuntoRecoleccion (PuntosRecoleccion puntoRec){
        listaPuntosRecoleccion.remove(puntoRec);
    }

    public void modificarPuntoRecoleccion (PuntosRecoleccion puntoRec, PuntosRecoleccion puntoRecNuevo) {
        if (listaPuntosRecoleccion.contains(puntoRec)) {
            listaPuntosRecoleccion.remove(puntoRec);
            listaPuntosRecoleccion.add(puntoRecNuevo);
        } else {
            System.out.println("El punto de recoleccion no existe");
        }
    }

    public void agregarResiduoAceptadoAPuntoRecoleccion (TipoResiduo tipoRes,Integer cant, PuntosRecoleccion puntoRec){
        puntoRec.getListaResiduos().put(tipoRes,puntoRec.getListaResiduos().get(tipoRes)+cant);
    }

    public void quitarResiduoAPuntoRecoleccion(TipoResiduo tipoRes, Integer cant, PuntosRecoleccion puntoRec){
        puntoRec.getListaResiduos().remove(tipoRes);
    }

    public boolean consultarTipoResiduoAceptado(TipoResiduo tipoRes, PuntosRecoleccion puntoRec){
        if(puntoRec.getListaResiduos().containsKey(tipoRes)){
            return true;
        }
        else {
            return false;
        }
    }

    public HashSet<PuntosRecoleccion> puntosPorBarrio(String barrio){
        HashSet<PuntosRecoleccion> listaPuntosRecDelBarrio = new HashSet<>();

        for(PuntosRecoleccion puntoRec : listaPuntosRecoleccion){
            if(puntoRec.getBarrio().equals(barrio)){
                listaPuntosRecDelBarrio.add(puntoRec);
            }
        }
        return listaPuntosRecDelBarrio;
    }

    public HashSet<PuntosRecoleccion> puntosPorResiduo(TipoResiduo tipoRes){
        HashSet<PuntosRecoleccion> listaPuntosPorResiduo = new HashSet<>();

        for(PuntosRecoleccion puntoRec : listaPuntosRecoleccion){
            if(puntoRec.getListaResiduos().containsKey(tipoRes)){
                listaPuntosPorResiduo.add(puntoRec);
            }
        }
        return listaPuntosPorResiduo;
    }

    public int cantPuntosPorResiduo(TipoResiduo tipoRes){
        return puntosPorResiduo(tipoRes).size();
    }

    public HashMap<TipoResiduo, Integer> CantPuntosParaCadaResiduoPorBarrio (String barrio, TipoResiduo tipoRes) {
        HashMap<TipoResiduo, Integer> listaCantResiduoPorBarrio = new HashMap<>();

        for (PuntosRecoleccion puntoRec : listaPuntosRecoleccion) {
            if (puntoRec.getBarrio().equals(barrio) && puntoRec.getListaResiduos().containsKey(tipoRes)){
                listaCantResiduoPorBarrio.put(tipoRes, cantPuntosPorResiduo(tipoRes));
            }
        }
        return listaCantResiduoPorBarrio;
    }


    public void recolectar (Camion cam, ArrayList<PuntosRecoleccion> puntosRec){

    }

    

}
