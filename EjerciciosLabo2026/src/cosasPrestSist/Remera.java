package cosasPrestSist;

public class Remera extends Ropa implements Prestable{
    private int medEspalda, medContorno, medLargoTorso;


    public int getMedEspalda() {
        return medEspalda;
    }
    public void setMedEspalda(int medEspalda) {
        this.medEspalda = medEspalda;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "Remera{" +
                "medEspalda=" + medEspalda +
                ", medContorno=" + medContorno +
                ", medLargoTorso=" + medLargoTorso +
                '}';
    }

    @Override
    public void prestar() {
        try {
            puedePrestarse();
            System.out.println("la remera" + this.getMarca() + "se dara prestada");

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
