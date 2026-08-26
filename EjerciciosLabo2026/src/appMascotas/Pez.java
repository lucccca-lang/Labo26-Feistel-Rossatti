package appMascotas;

public class Pez extends Mascotas{
    private int vidas;

    public Pez(String nombre, String dueño, TipoMascota tipoMascota) {
        super(nombre, dueño, tipoMascota);
        this.vidas = 10;
    }


    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }


    @Override
    public void morir() {
        this.vidas = 0;
    }

    @Override
    public void alimentar() {
        this.vidas++;
    }

    @Override
    public void restarVida() {
        this.vidas-=1;
    }

    @Override
    public TipoMascota tipoMascota() {
        return TipoMascota.PEZ;
    }

    @Override
    public String saludo() {
        return "";
    }
}