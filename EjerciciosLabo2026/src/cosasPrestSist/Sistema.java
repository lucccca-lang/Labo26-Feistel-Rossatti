package cosasPrestSist;

import java.util.HashSet;

public class Sistema {
    private HashSet<Prestable> listaObjPrestables;
    private HashSet<Ropa> listaRopa;
    private HashSet<Textos> listaTextos;

    public void agregarRopa (Ropa r){
        this.listaRopa.add(r);
        if(r instanceof Prestable){                              //que agregue a su lista
            this.listaObjPrestables.add((Prestable) r);          // que pregunte si la ropa es prestable y ahi
        }                                                       // castea a prestable para agregarlo a la lista
    }

    public void agregarTexto (Textos t){
        this.listaTextos.add(t);
        if(t instanceof Prestable){
            this.listaObjPrestables.add((Prestable) t);
        }
    }

    public int cantObjPrestables(){
        return listaObjPrestables.size();
    }

    public int cantObjNoPrestables(){
        return listaRopa.size() + listaTextos.size() - listaObjPrestables.size();
    }

}
