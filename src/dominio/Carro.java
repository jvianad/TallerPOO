package dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public Carro(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public void acelerar(){
        System.out.println("El carro esta acelerando");
    }

    public void frenar(){
        System.out.println("El carro esta frenando");
    }

    public String girar(String direccion){
        switch (direccion.toLowerCase()){
            case "izquierda":
                System.out.println("Girando hacia la izquierda");
                break;
            case "derecha":
                System.out.println("Girando hacia la derecha");
                break;
            default:
                System.out.println("No existe ese giro");
        }
        return direccion;
    }

    public String mostrarInformacion(){
        return  "Marca:  "+this.marca+"\n"+
                "Modelo: "+this.modelo+"\n"+
                "Año:    "+this.anio+"\n"+
                "Color:  "+this.color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
