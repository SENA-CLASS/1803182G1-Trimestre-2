package co.edu.sena.poo.ejemplo18collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(4);
        cola.add(6);
        cola.add(7);
        cola.add(8);
        cola.add(9);
        cola.add(12);
        cola.add(15);

        //System.out.println(cola.peek());

        cola.poll();

        for (Integer elemento: cola
             ) {
            System.out.println(elemento);
        }

        Queue<Integer> cola2 = new ArrayDeque<>();
        cola2.add(5);
        cola2.add(89);
        cola2.add(8);
        cola2.add(9);


        for (Integer ele: cola2
             ) {
            System.out.println(ele);
        }
    }
}
