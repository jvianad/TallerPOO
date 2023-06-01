package test;

import dominio.EquipoFutbol;
import dominio.Jugador;
import java.util.ArrayList;

public class EquipoFutbolPrueba {
    public static void main(String[] args) {
        /*ArrayList<Jugador> jugadores = new ArrayList<>();*/

        Jugador jugador1 = new Jugador("Jean",20);
        Jugador jugador2 = new Jugador("jesus",50);
        Jugador jugador3 = new Jugador("jose",60);

        EquipoFutbol equipo = new EquipoFutbol("Salle","cartagena",new ArrayList<>());

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        System.out.println(equipo.mostrarInformacion());

    }
}
