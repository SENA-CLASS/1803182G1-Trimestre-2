package co.edu.sena.poo.ejemplo14realizacion;

public class Mudo implements MudoInterface {
    @Override
    public void ver() {
        System.out.println("veo");
    }

    @Override
    public void escuchar() {
        System.out.println("escuchar");
    }

    @Override
    public void caminar() {
        System.out.println("camino");
    }
}
