package dominio;

import java.util.ArrayList;

public class EquipoFutbol {
    private String nombre;
    private String ciudad;
    private ArrayList<Jugador>jugadores;

    public EquipoFutbol(String nombre, String ciudad, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String mostrarInformacion(){
        return  "Nombre del equipo: "+this.nombre+"\n"+
                "Ciudad:            "+this.ciudad+"\n"+
                "Jugadores: "+this.jugadores;
    }

}
