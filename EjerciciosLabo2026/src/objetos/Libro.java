package objetos;

import fechas.Fecha;
import seresVivos.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private String isbn;
    private int cantDePags;
    private Editorial editorial;
    private Fecha fechaDePublicacion;

    public Libro(){
        this.titulo = "Habitos Atomicos";
        this.autor = new Persona("James Clear", "dsadas", "Washington 1234",LocalDate.of(1999,1,1));
        this.isbn = "1234-321";
        this.cantDePags = 400;
        this.editorial = Editorial.SUDAMERICANA;
        this.fechaDePublicacion= new Fecha();
    }

    public Libro(String titulo, Persona autor, String isbn, int cantDePags, Editorial editorial, Fecha fechaDePublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.cantDePags = cantDePags;
        this.editorial = editorial;
        this.fechaDePublicacion= fechaDePublicacion;
    }

    public Libro(String titulo,Persona autor, int cantDePags, Fecha fechaDePublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = "4321-123";
        this.cantDePags = cantDePags;
        this.editorial = Editorial.SUR;
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }
    public Persona getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getCantDePags() {
        return cantDePags;
    }
    public Fecha getFechaDePublicacion() {
        return fechaDePublicacion;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCantDePags(int cantDePags) {
        this.cantDePags = cantDePags;
    }
    public void setFechaDePublicacion(Fecha fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.print("Autor: " );
        autor.datosPersona();
        System.out.println("ISBN: " + isbn);
        System.out.println("Cant de Paginas: " + cantDePags);
        System.out.println("Editorial: " + editorial.name());
        System.out.print("fecha.Fecha de Publicacion: ");
        fechaDePublicacion.corta();
    }

    public void masViejo(Libro libro){
        if (fechaDePublicacion.menorQue(libro.getFechaDePublicacion())){
            System.out.println("El libro " + titulo + " se publico antes que " + libro.getTitulo());
        }
        else {
            System.out.println("El libro " + libro.getTitulo() + " se publico antes");
        }
    }

    public void mostrarEditoriales(){
        Editorial[] nombres = Editorial.values();
        for (Editorial edi : nombres){
            System.out.println("Estas son las editoriales" + edi);
        }
    }



    public static void main(String[] args) {
        Libro libro = new Libro();
        Persona autor = new Persona("Mujica Lainez","asdasd","dasdasd 1213", LocalDate.of(1999,1,1));
        Libro libro1 = new Libro("aaa", autor, "123-123",302,Editorial.SUR, new Fecha());
        Libro libro2 = new Libro("IT", new Persona("Stephen King","dasdasd","New York 1232",LocalDate.of(1998,1,1)),500,new Fecha(20,5,2009));
        System.out.println("Getters: " + libro.getTitulo() + libro.getEditorial() + libro.getIsbn() + libro.getAutor().getNombre() + libro.getCantDePags() + libro.getFechaDePublicacion().getDia() + libro.getFechaDePublicacion().getMes() + libro.getFechaDePublicacion().getAnio());
        libro1.setTitulo("Misteriosa Buenos Aires");
        System.out.println("Metodo de mostrar libro:");
        libro2.mostrarInfo();
        libro2.masViejo(libro1);
    }
}