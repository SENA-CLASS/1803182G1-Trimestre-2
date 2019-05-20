package co.edu.sena.poo.ejemplo03encapsular;

public class App {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.setColor("blanco");
        tablero.setMaterial("acrilico");
        tablero.setSize(6);

        System.out.println(tablero.getColor());
        System.out.println(tablero.getMaterial());
        System.out.println(tablero.getSize());


        Carro carro = new Carro();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.getVelicidad());
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        carro.frenar();
        System.out.println(carro.getVelicidad());




    }
}
