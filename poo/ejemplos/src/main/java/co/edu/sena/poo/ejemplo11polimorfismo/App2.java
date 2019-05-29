package co.edu.sena.poo.ejemplo11polimorfismo;

public class App2 {
    public static void main(String[] args) {
        Moto moto1 = new Moto();
        Moto moto2 = moto1;
        Moto moto3 = moto2;
        Moto moto4 = moto3;
        moto4 = new Moto();
        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println(moto3);
        System.out.println(moto4);

    }
}
