package co.edu.sena.poo.ejemplo18collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {
        List<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(5);
        arreglo.add(6);
        arreglo.add(7);
        arreglo.add(2);
        arreglo.add(345);
        arreglo.add(3,234);





        for (int i = 0; i <arreglo.size() ; i++) {
            System.out.println(arreglo.get(i));
        }



    }
}
