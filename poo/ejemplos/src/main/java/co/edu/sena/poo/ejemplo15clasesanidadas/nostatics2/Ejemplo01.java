package co.edu.sena.poo.ejemplo15clasesanidadas.nostatics2;

public class Ejemplo01 {
    public static void main(String[] args) {
        Clase01 clase01 = new Clase01();
        System.out.println(clase01);
        InterfaceClase02 clase02 =  clase01.getClase02();
        System.out.println(clase02);
        InterfaceClase03 clase03 = clase02.getClase03();
        System.out.println(clase03);
        InterfaceClase04 clase04 = clase03.getClase04();
        System.out.println(clase04);

        // usado en patrones de diseño como el iterator

    }
}
