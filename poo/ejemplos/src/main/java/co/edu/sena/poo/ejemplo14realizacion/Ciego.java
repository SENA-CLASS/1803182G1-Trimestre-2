package co.edu.sena.poo.ejemplo14realizacion;

public class Ciego implements CiegoInterface {
    @Override
    public void escuchar() {
        System.out.println("escucho");
    }

    @Override
    public void hablar() {
        System.out.println("hablo");
    }

    @Override
    public void caminar() {
        System.out.println("camino con ayuda de un bastón y con un perro lazarillo");
    }
}
