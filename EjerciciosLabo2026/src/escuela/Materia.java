package escuela;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Materia {
    private Materias nombre;
    private ArrayList<String> listaContenidos;
    private ArrayList<Alumno> alumnos;


    public Materias getNombre() {
        return nombre;
    }

    public void setNombre(Materias nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }

    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int promEdad() {
        int promedio = 0;
        int edadT = 0;
        for (Alumno al : alumnos) {
            edadT += LocalDate.now().getYear() - al.getFechaNac().getYear();
        }
        promedio = edadT / alumnos.size();
        return promedio;
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnos.add(alumno);
        alumno.inscribirMateria(this);
    }

    public void agregarContenido(String cont) {
        listaContenidos.add(cont);
    }

    public void listarInscriptos() {
        for (Alumno al : alumnos) {
            System.out.println(al.getNombre() + al.getApellido());
        }
    }

    public static void main(String[] args) {
        Materia m1 = new Materia();
        m1.inscribirAlumno(new Alumno());
    }

}