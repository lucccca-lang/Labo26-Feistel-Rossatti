package escuela;

import fechas.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private ArrayList<Float> listaNotas;
    private ArrayList<Materia> materias;

    public Alumno(){
        this.nombre = "Jose";
        this.apellido = "Gomez";
        this.fechaNac = LocalDate.of(2000, 02, 28);
        this.listaNotas = new ArrayList<Float>();
        this.materias = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    public ArrayList<Float> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Float> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void agregarNota(float nota){
        this.listaNotas.add(nota);
    }

    public float menorNota() {
        float meNota = this.listaNotas.get(0);

        for (float nota : listaNotas) {
            if (meNota > nota) {
                meNota = nota;
                return meNota;
            }
        }
    }


    public float mayorNota(){
        float mNota = this.listaNotas.get(0);

        for(float nota : listaNotas){
            if(mNota < nota){
                mNota = nota;
                return mNota;

            }
        }
    }

    public float promNotas(){
        float promedio = 0;
        float notaT = 0;
            for(float not : listaNotas){
                notaT += not;
            }
        promedio = notaT / listaNotas.size();
            return promedio;
    }

    public void inscribirMateria(Materia materia){
        materias.add(materia);
    }





    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.agregarNota(5);
        a1.agregarNota(7);

        System.out.println(a1.menorNota() + " es la menor nota");
        System.out.println(a1.mayorNota() + " es la mayor nota");

    }

    /*public static void main(String[] args) {
        boolean dispo = true;
        if(!dispo()){                lo mismo que dispo==true

        }
    }*/
}
