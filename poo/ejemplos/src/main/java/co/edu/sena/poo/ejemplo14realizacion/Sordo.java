package co.edu.sena.poo.ejemplo14realizacion;

public class Sordo implements SordoInterface {
    @Override
    public void hablar() {
        System.out.println("hablo raro peor hablo y con señas");
    }

    @Override
    public void caminar() {
        System.out.println("camino");
    }

    @Override
    public void ver() {
        System.out.println("veo");
    }
}
