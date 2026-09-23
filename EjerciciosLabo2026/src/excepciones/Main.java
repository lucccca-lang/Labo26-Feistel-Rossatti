package excepciones;

public class Main {

    public int obtenerLongitud(String nombre) throws NullPointerException{
        if (nombre == null) { throw new NullPointerException();}                    //con exception predet
        return nombre.length();
    }

    public int obtenerLongitudd(String nombre) throws NullPerso{
        if (nombre == null) { throw new NullPerso("El nombre es nulo");}            //con exception nueva perso
        return nombre.length();
    }

    public static void main(String[] args){
        String nombre = null;

        try {
            System.out.println("El largo del nombre es:" + nombre.length());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());                                     //en try catch directo
            System.out.println("facu y luqui");
        }

        Main m = new Main();

        try {
            m.obtenerLongitud("valle");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            m.obtenerLongitudd("valle");
        }catch (NullPerso e){
            System.out.println(e.getMessage());
        }
    }



}
