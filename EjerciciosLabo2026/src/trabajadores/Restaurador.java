package trabajadores;

import objetos.Cuadro;
import objetos.EstadoCuadro;
import seresVivos.Persona;

import java.time.LocalDate;

public class Restaurador extends Persona {
    private int dni;
    private int aniosExp;

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAniosExp() {
        return aniosExp;
    }
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public Restaurador(){
        super();
        this.dni = 22273824;
        this.aniosExp = 24;
    }

    public void restaurar(Cuadro cuadro){
        EstadoCuadro estadoViejo = cuadro.getEstado();

        if(cuadro.getAnioCreacion() < 2001 && cuadro.getEstado().ordinal() < 9){
            int nueva = cuadro.getEstado().ordinal()+2;
            cuadro.setEstado(EstadoCuadro.values()[nueva]);
        }
        else if(cuadro.getAnioCreacion() > 2001 && cuadro.getEstado().ordinal() < 8){
            int nueva = cuadro.getEstado().ordinal()+3;
            cuadro.setEstado(EstadoCuadro.values()[nueva]);
        }
        else if (cuadro.getEstado().ordinal() == 10) {
            System.out.println("El cuadro esta en perfecto estado");
        }
        else{
            cuadro.setEstado(EstadoCuadro.values()[10]);
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
