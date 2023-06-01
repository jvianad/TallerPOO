package test;

import dominio.Carro;

public class CarroPrueba {
    public static void main(String[] args) {
        Carro carro1 = new Carro("lamborguini","antiguo",2013,"Rojo");
        Carro carro2 = new Carro("Ferrari","Nuevo",2024,"Rojo");

        //carro1
        carro1.acelerar();
        carro1.frenar();
        carro1.girar("Derecha");
        System.out.println(carro1.mostrarInformacion());

        System.out.println("");
        //carro2
        carro2.acelerar();
        carro2.frenar();
        carro2.girar("izquierda");
        System.out.println(carro2.mostrarInformacion());
    }


}
