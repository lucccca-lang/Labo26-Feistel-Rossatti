package trabajadores;

import objetos.Cuadro;

import java.time.LocalDate;

public class Restaurador {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private int aniosExp;

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
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getAniosExp() {
        return aniosExp;
    }
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public Restaurador(){
        this.nombre = "Rodrigo";
        this.apellido = "Gutierrez";
        this.dni = 22273824;
        this.fechaNacimiento = LocalDate.of(1972,04,23);
        this.aniosExp = 24;
    }

    public void restaurar(Cuadro cuadro){
        int estadoViejo = cuadro.getEstado();

        if(cuadro.getAnioCreacion() < 2001 && cuadro.getEstado() < 9){
            cuadro.setEstado(cuadro.getEstado()+2);
        }
        else if(cuadro.getAnioCreacion() > 2001 && cuadro.getEstado() < 8){
            cuadro.setEstado(cuadro.getEstado()+3);
        }
        else if (cuadro.getEstado() == 10) {
            System.out.println("El cuadro esta en perfecto estado");
        }
        else{
            cuadro.setEstado(10);
        }
        System.out.println("El cuadro estaba " + estadoViejo + " puntos");
        System.out.println("El cuadro quedo " + cuadro.getEstado() + " puntos");
    }


    public static void main(String[] args) {
        Cuadro cuadro1 = new Cuadro();
        Restaurador restaurador1 = new Restaurador();

        System.out.println("Restauramos un cuadro ");
        restaurador1.restaurar(cuadro1);
    }
}
