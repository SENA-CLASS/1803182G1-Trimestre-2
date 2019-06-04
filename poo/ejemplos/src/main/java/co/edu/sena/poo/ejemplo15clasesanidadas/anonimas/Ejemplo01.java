package co.edu.sena.poo.ejemplo15clasesanidadas.anonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejemplo01 {
    public static void main(String[] args) {
        SordoInterface sordo = new SordoInterface() {
            @Override
            public void hablar() {
                System.out.println("habla");
            }

            @Override
            public void caminar() {
                System.out.println("camina");
            }

            @Override
            public void ver() {
                System.out.println("ve");
            }
        };
        System.out.println(sordo);

        sordo.caminar();
        sordo.hablar();
        sordo.ver();

        List<String> lista = new ArrayList<>();
        lista.add("pedro");
        lista.add("lorena");
        lista.add("jose");

        Collections.sort(lista, new Comparator<String>() {// complejo java 8 lambda meter progración fucnional
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String a:lista
             ) {
            System.out.println(a);
        }











    }
}
