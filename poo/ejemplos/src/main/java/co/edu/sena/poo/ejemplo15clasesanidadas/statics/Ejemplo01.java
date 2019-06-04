package co.edu.sena.poo.ejemplo15clasesanidadas.statics;


import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {
    public static void main(String[] args) {

        Clase01 clase01 = new Clase01();

        Clase01.Clase02 clase02 = new Clase01.Clase02();
        System.out.println(clase02);

        Clase01.Clase02.Clase03 clase03 = new Clase01.Clase02.Clase03();

        Clase01.Clase02.Clase03.Clase04 clase04 = new Clase01.Clase02.Clase03.Clase04();
        System.out.println(clase04);


    }
}
