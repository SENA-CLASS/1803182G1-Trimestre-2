package co.edu.sena.poo.ejemplo03encapsular;

public class Ejemplo01 {
    public static void main(String[] args) {
        Esfero esfero1 = new Esfero();
        esfero1.setColor("negro");
        esfero1.setColorTinta("negro");
        esfero1.setMarca("kilometrico");
        esfero1.setPrecio(1000.50F);
        System.out.println(esfero1.getColor());
        System.out.println(esfero1.getColorTinta());
        System.out.println(esfero1.getMarca());
        System.out.println(esfero1.getPrecio());
    }
}
