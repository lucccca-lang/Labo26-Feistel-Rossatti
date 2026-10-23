package fundacionEndo;

import java.time.LocalDate;

public class Ninio extends Paciente implements PorTratar{
    private NivelTolerancia tolerancia;
    private static TipoSangre objSangre = TipoSangre.AB_POS;

    public NivelTolerancia getTolerancia() {
        return tolerancia;
    }
    public void setTolerancia(NivelTolerancia tolerancia) {
        this.tolerancia = tolerancia;
    }

    public Ninio(String nombre, String apellido, LocalDate fechaNac, String genero, TipoSangre tipoSangre, NivelTolerancia tolerancia) {
        super(nombre, apellido, fechaNac, genero, tipoSangre);
        this.tolerancia = tolerancia;
    }

    @Override
    public boolean verificar(){
        if(super.getFechaNac().getYear() < 2023){
            return true;
        }
        return false;
    }

    @Override
    public String solicitarTratamiento(){
        if(verificar()){
            System.out.println("Tu tratamiento tardará esta cantidad de días: " + (this.getTolerancia().getNivel() * 2));
        }
        return "Aún es chico para probar el tratamiento";
    }

    @Override
    public int solicitarCostoTratamiento() {
        return this.getTolerancia().getNivel() * 450000;
    }


}
