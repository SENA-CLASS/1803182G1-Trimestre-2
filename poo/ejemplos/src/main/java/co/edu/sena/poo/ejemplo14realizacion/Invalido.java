package co.edu.sena.poo.ejemplo14realizacion;

public class Invalido implements InvalidoInterface {
    @Override
    public void escuchar() {
        System.out.println("escucha");
    }

    @Override
    public void hablar() {
        System.out.println("hablo");
    }

    @Override
    public void ver() {
        System.out.println("veo");
    }
}
