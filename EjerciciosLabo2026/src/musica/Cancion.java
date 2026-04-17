 package musica;

import seresVivos.Persona;

    public class Cancion {
        private String titulo;
        private Persona autor;

        public Cancion(){
            this.titulo = "Chau";
            this.autor = new Persona("Leandro",14,"Urquiza");
        }

        public Cancion(String titulo,Persona autor){
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public Persona getAutor() {
            return autor;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(Persona autor) {
            this.autor = autor;
        }

        public static void main(String[] args) {
            Cancion cancion = new Cancion();
            Cancion cancion1 = new Cancion("Sugar On My Tongue",new Persona("Tyler, The Creator",35,"Los Angeles 1231"));

            System.out.println("Getters: " + cancion1.getTitulo() + ", " + cancion1.getAutor().getNombre() + ", " +cancion1.getAutor().getEdad() + ", " + cancion1.getAutor().getDireccion());

            System.out.println("Modificacion de cancion con setters:");
            cancion.setAutor(new Persona("A$AP Rocky",37,"Los Angeles 4321"));
            cancion.setTitulo("Sundress");

            System.out.println("Getters dsp de los setters: " + cancion.getTitulo() + ", " + cancion.getAutor().getNombre() + ", " +cancion.getAutor().getEdad() + ", " + cancion.getAutor().getDireccion());
        }
    }

