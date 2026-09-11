package residuos;

import java.util.HashSet;

public class Sistema {
    private HashSet<TipoResiduo> listaTipoResiduo;
    private HashSet<PuntosRecoleccion> listaPuntosRecoleccion;

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
        if(tipoRes.isEsReciclable()){
            puntoRec.getListaResiduos().put(tipoRes,puntoRec.getListaResiduos().get(tipoRes)+cant);
        }
    }

    public void quitarResiduoAPuntoRecoleccion(){}


}
