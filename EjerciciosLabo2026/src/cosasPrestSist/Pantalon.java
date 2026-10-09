package cosasPrestSist;

public class Pantalon extends Ropa implements Prestable{
    private int medCintura, medCadera, medLargo;
    public int getMedCintura() {
        return medCintura;
    }
    public void setMedCintura(int medCintura) {
        this.medCintura = medCintura;
    }
    public int getMedCadera() {
        return medCadera;
    }
    public void setMedCadera(int medCadera) {
        this.medCadera = medCadera;
    }
    public int getMedLargo() {
        return medLargo;
    }
    public void setMedLargo(int medLargo) {
        this.medLargo = medLargo;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "Pantalon{" +
                "medCintura=" + medCintura +
                ", medCadera=" + medCadera +
                ", medLargo=" + medLargo +
                '}';
    }

    @Override
    public void prestar() {
        try {
            puedePrestarse();
            System.out.println("El pantalon" + this.getMarca() + "se dara prestado");
        }
        catch (NoSePuedePrestarException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void puedePrestarse() throws NoSePuedePrestarException{
        if(!this.isEstado()){
            throw new NoSePuedePrestarException("Tiene una mancha o rotura");
        }
    }


}
