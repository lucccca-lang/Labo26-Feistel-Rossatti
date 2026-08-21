package appMascotas;

public class PajaroCantor extends Pajaro{
    private String canto;

    public String getCanto() {
        return canto;
    }
    public void setCanto(String canto) {
        this.canto = canto;
    }

    public PajaroCantor(String nombre, String dueño, TipoMascota tipoMascota, String canto) {
        super(nombre, dueño, tipoMascota);
        this.canto = canto;
    }


}
