package bibliotecaVirtual;

public class LibroElectronico {

    public String titulo;
    public Genero genero;
    public Autor autorLibro;
    public String nombrePDF;
    public static int descargasDisp = 145;
    public int descargasActuales;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Genero getGénero() {
        return genero;
    }
    public void setGénero(Genero genero) {
        this.genero = genero;
    }
    public Autor getAutorLibro() {
        return autorLibro;
    }
    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }
    public String getNombrePDF() {
        return nombrePDF;
    }
    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }
    public static int getDescargasDisp() {
        return descargasDisp;
    }
    public static void setDescargasDisp(int descargasDisp) {
        LibroElectronico.descargasDisp = descargasDisp;
    }
    public int getDescargasActuales() {
        return descargasActuales;
    }
    public void setDescargasActuales(int descargasActuales) {
        this.descargasActuales = descargasActuales;
    }

    public LibroElectronico(String titulo, Genero genero, Autor autorLibro, String nombrePDF, int descargasActuales) {
        this.titulo = titulo;
        this.genero = genero;
        this.autorLibro = autorLibro;
        this.nombrePDF = nombrePDF;
        this.descargasActuales = descargasActuales;
    }
}
