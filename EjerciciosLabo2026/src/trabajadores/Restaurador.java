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
            cuadro.setEstado(EstadoCuadro.values()[nueva-1]);
        }
        else if(cuadro.getAnioCreacion() > 2001 && cuadro.getEstado().ordinal() < 8){
            int nueva = cuadro.getEstado().ordinal()+3;
            cuadro.setEstado(EstadoCuadro.values()[nueva-1]);
        }
        else if (cuadro.getEstado().ordinal() == 10) {
            System.out.println("El cuadro esta en perfecto estado");
        }
        else{
            cuadro.setEstado(EstadoCuadro.values()[9]);
        }
        System.out.println("El cuadro estaba " + estadoViejo + " puntos");
        System.out.println("El cuadro quedo " + cuadro.getEstado() + " puntos");
    }


    public static void main(String[] args) {
        Cuadro cuadro1 = new Cuadro();
        Cuadro cuadro2 = new Cuadro("ABC","Van Gogh",2020,EstadoCuadro.OCHO);
        Cuadro cuadro3 = new Cuadro("ABC","Van Gogh",2020,EstadoCuadro.DIEZ);
        Restaurador restaurador1 = new Restaurador();

        System.out.println("Restauramos un cuadro ");
        restaurador1.restaurar(cuadro2);
        restaurador1.restaurar(cuadro3);
    }
}
