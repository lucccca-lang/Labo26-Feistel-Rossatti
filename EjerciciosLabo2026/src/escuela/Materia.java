package escuela;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaContenidos;
    private Alumno alumnos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }
    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }
    public Alumno getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }


    public float promEdad(){

    }
}
