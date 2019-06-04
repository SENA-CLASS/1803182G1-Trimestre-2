package co.edu.sena.poo.ejemplo15clasesanidadas.statics2;

public class Ejemplo01 {
    public static void main(String[] args) {

        Clase01 clase01 = new Clase01();


        InterfaceClase02 clase02 = Clase01.getClase02();

        InterfaceClase03 clase03 = Clase01.Clase02.getClase03();

        InterfaceClase04 clase04 = Clase01.Clase02.Clase03.getClase04();


    }
}
