package orgPoliticas;

public class PalomaMensajera extends Ave implements Campanias{
    private boolean aprendioMapa;


    @Override
    public void enviarMensajeDirigente() {
        if(aprendioMapa){
        System.out.println("Lanzando un papelito que dice: Vote por el partido para un mejor futuro");}
        else {
            System.out.println("No sabe volar");
        }
    }
}
