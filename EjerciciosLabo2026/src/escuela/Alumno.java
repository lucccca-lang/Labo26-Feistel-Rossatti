package escuela;

import fechas.Fecha;
import seresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Float> listaNotas;
    private ArrayList<Materia> materias;
    private int division;

    public Alumno(){
        super();
        this.listaNotas = new ArrayList<Float>();
        this.materias = new ArrayList<Materia>();
    }
    public Alumno(String nombre, String apellido, int division){
        super(nombre, apellido);
        this.division = division;
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
    public int getDivision() {
        return division;
    }
    public void setDivision(int division) {
        this.division = division;
    }

    public void agregarNota(float nota){
        this.listaNotas.add(nota);
    }

    public float menorNota() {
        float meNota = this.listaNotas.get(0);

        for (float nota : listaNotas) {
            if (meNota > nota) {
                meNota = nota;

            }
        }
        return meNota;
    }


    public float mayorNota() {
        float mNota = this.listaNotas.get(0);

        for (float nota : listaNotas) {
            if (mNota < nota) {
                mNota = nota;


            }
        }
        return mNota;
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

    public void mostrarDatos(){
        super.datosPersona();
        System.out.println("Las materias de este alumno son: " + getMaterias());
        System.out.println("las notas de este alumno son: " + getListaNotas());
    }


    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.agregarNota(5);
        a1.agregarNota(7);

        a1.mostrarDatos();
        System.out.println(a1.menorNota() + " es la menor nota");
        System.out.println(a1.mayorNota() + " es la mayor nota");


    }

    /*public static void main(String[] args) {
        boolean dispo = true;
        if(!dispo()){                lo mismo que dispo==true

        }
    }*/
}
