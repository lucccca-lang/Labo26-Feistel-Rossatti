package barSist;

public abstract class Beneficio {
    private String nombreBenef;
    private String usuarioCreador;

    public String getNombreBenef() {
        return nombreBenef;
    }
    public void setNombreBenef(String nombreBenef) {
        this.nombreBenef = nombreBenef;
    }
    public String getUsuarioCreador() {
        return usuarioCreador;
    }
    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public Beneficio(String nombreBenef, String usuarioCreador) {
        this.nombreBenef = nombreBenef;
        this.usuarioCreador = usuarioCreador;
    }

}
