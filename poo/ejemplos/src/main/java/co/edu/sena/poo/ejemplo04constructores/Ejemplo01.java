package co.edu.sena.poo.ejemplo04constructores;

public class Ejemplo01 {
    public static void main(String[] args) {
        Celular celular = new Celular();
        System.out.println(celular.getMarca());
        System.out.println(celular.getReferencia());
        System.out.println(celular.getPrecio());
        Ventilador ventilador = new Ventilador();

        Computador computador = new Computador("asus", "2019rr");

        Celular celular1 = new Celular("refe01");
        Celular celular2 = new Celular("sony","xpriria 3",2500000);
        Celular celular3 = new Celular(300000.50F);
    }
}
