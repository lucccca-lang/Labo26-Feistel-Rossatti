package cosasPrestSist;

import java.util.HashSet;

public class Sistema {
    private HashSet<Prestable> listaObjPrestables;
    private HashSet<Prestable> listaObjNoPrestables;


    public void agregarObjeto(Prestable obj){
        try{
            obj.puedePrestarse();
            listaObjPrestables.add(obj);
        }
        catch (NoSePuedePrestarException e){
            listaObjNoPrestables.add(obj);
        }
    }

    public int cantObjPrestables(){
        return listaObjPrestables.size();
    }

    public int cantObjNoPrestables(){
        return listaObjNoPrestables.size();
    }


}
