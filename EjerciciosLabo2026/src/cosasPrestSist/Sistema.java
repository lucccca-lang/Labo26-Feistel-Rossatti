package cosasPrestSist;

import java.util.HashSet;

public class Sistema {
    private HashSet<Prestable> listaObjPrestables;
    private HashSet<Ropa> listaRopa;
    private HashSet<Textos> listaTextos;

    public void agregarRopaPrestable (Ropa r){
        if(r instanceof Prestable){
            listaObjPrestables.add((Prestable) r);              // que pregunte si la ropa es prestable y ahi
        }                                                       // castea a prestable para agregarlo a la lista
    }

    public void agregarTextoPrestable (Textos t){
        if(t instanceof Prestable){
            listaObjPrestables.add((Prestable) t);
        }
    }

    public int cantObjPrestables(){
        return listaObjPrestables.size();
    }

    public int cantObjNoPrestables(){
        return listaRopa.size() + listaTextos.size() - listaObjPrestables.size();
    }

}
