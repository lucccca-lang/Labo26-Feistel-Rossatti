package deportes;

import seresVivos.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;

public class Torneo {
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;
    int dias;

    public Torneo(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
        this.dias = 0;
        this.partidos = new ArrayList<>();
        generarPartidos();
    }



    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void generarPartidos(){

        for(Equipo equipo1 : equipos){
            for (Equipo equipo2 : equipos){
                Partido partido = new Partido(equipo1, equipo2);

                if (partidos.isEmpty() && (!equipo1.equals(equipo2)) || partidos.contains(partido) && (!equipo1.equals(equipo2))){

                    if (partido.getTurno()!=null){
                        partidos.add(partido);
                        dias +=1;
                    }


                }

            }





        }
    }

    public static void main(String[] args) {
        /*Equipo 1*/
        Jugador jugador1 = new Jugador("aaaa","aaa", LocalDate.of(1999,10,10),10);
        Jugador jugador2 = new Jugador("bbbb","bbb",LocalDate.of(1999,2,4),1);
        Jugador jugador3 = new Jugador("cccc","ccc",LocalDate.of(1999,3,2),1);
        ArrayList<Jugador>lista = new ArrayList<>();
        ArrayList<Turno>disp1 = new ArrayList<>();
        lista.add(jugador1);
        lista.add(jugador2);
        lista.add(jugador3);
        disp1.add(Turno.MAÑANA);
        disp1.add(Turno.TARDE);
        disp1.add(Turno.NOCHE);

        //Equipo 2
        Jugador jugador4 = new Jugador("dddd","ddd", LocalDate.of(1999,10,10),10);
        Jugador jugador5 = new Jugador("eeee","eee",LocalDate.of(1999,2,4),1);
        Jugador jugador6 = new Jugador("ffff","fff",LocalDate.of(1999,3,2),1);
        ArrayList<Jugador>lista1 = new ArrayList<>();
        lista1.add(jugador4);
        lista1.add(jugador5);
        lista1.add(jugador6);
        ArrayList<Turno>disp2 = new ArrayList<>();
        disp2.add(Turno.NOCHE);

        Equipo equipo1 = new Equipo("AAA",disp1,jugador1,lista);
        Equipo equipo2 = new Equipo("BBB",disp2,jugador4,lista1);
        ArrayList<Equipo>equipos1 = new ArrayList<>();
        equipos1.add(equipo1);
        equipos1.add(equipo2);

        Torneo torneo = new Torneo(equipos1);


        System.out.println(torneo.dias + " dia ," + torneo.partidos.getFirst().getEquipo1().getNombre() + "vs" + torneo.partidos.getFirst().getEquipo2().getNombre() + " turno: " + torneo.partidos.getFirst().getTurno());

    }
}