package co.edu.sena.poo.ejemplo15clasesanidadas.nostatics;

public class Ejemplo01 {
    public static void main(String[] args) {
        Clase01 clase01 = new Clase01();

        Clase01.Clase02 clase02 = clase01.new Clase02();

        Clase01.Clase02.Clase03 clase03 = clase02.new Clase03();

        Clase01.Clase02.Clase03.Clase04 clase04 = clase03.new Clase04();
    }
}
