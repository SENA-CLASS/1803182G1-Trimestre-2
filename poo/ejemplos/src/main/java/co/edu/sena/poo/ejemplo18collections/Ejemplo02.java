package co.edu.sena.poo.ejemplo18collections;

import java.util.Arrays;
import java.util.List;

public class Ejemplo02 {
    public static void main(String[] args) {
        Character [] arr = {'w','q','a','b'};


        Arrays.sort(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }


        List<Character> listaCaracteres = Arrays.asList(arr);
        for (Character c:listaCaracteres
             ) {
            System.out.println(c);
        }
    }
}
