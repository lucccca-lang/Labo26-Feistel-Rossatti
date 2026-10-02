package bibliotecaVirtual;

import objetos.Libro;

import java.util.HashSet;

public class Sistema {
    HashSet<Usuario> usuariosRegis;
    HashSet<LibroElectronico> listaLibros;

    public HashSet<Usuario> getUsuariosRegis() {
        return usuariosRegis;
    }
    public void setUsuariosRegis(HashSet<Usuario> usuariosRegis) {
        this.usuariosRegis = usuariosRegis;
    }
    public HashSet<LibroElectronico> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(HashSet<LibroElectronico> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Sistema() {
        this.usuariosRegis = new HashSet<>();
        this.listaLibros = new HashSet<>();
    }

    public void agregarUsuario(Usuario u1){
        usuariosRegis.add(u1);
    }

    public void agregarLibro(LibroElectronico l1){
        if (!listaLibros.contains(l1)){
        listaLibros.add(l1);}
    }

    public void modificarLibro (LibroElectronico lN, LibroElectronico LV){
        listaLibros.remove(LV);
        listaLibros.add(lN);
    }

    public void eliminarLibro(LibroElectronico l1){
        if (listaLibros.contains(l1)){
            listaLibros.remove(l1);
        }
    }

    public void tomarPrestadoLibro(LibroElectronico libroElec, Usuario u1) throws LimitePrestamosAlcanzadosException{
        if(libroElec.getDescargasActuales() < LibroElectronico.descargasDisp){
            u1.librosDescargados.add(libroElec);
            libroElec.setDescargasActuales(libroElec.getDescargasActuales()+1);
        }
        else {
            throw new LimitePrestamosAlcanzadosException("No quedan mas descargas disponibles para este libro");
        }
    }

    public void verificarLimMembresia (Usuario u1, LibroElectronico l1) throws MembresiaException{
        if(u1.getLibrosDescargados().size() < u1.getMembresia().getLimiteLibro()){
            u1.librosDescargados.add(l1);
            l1.setDescargasActuales(l1.getDescargasActuales()+1);
        }
        else {
            throw new MembresiaException("ya alcanzo el limite de prestamos");
        }
    }



}


