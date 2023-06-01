package dominio;

public class Jugador {
    private String nombre;
    private int numero;

    public Jugador(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    @Override
    public String toString() {
        return  "Nombre = " + this.nombre + '\n' +
                "Numero = " + this.numero ;
    }
}
