package co.edu.sena.poo.ejemplo18collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {

        Stack sillas  = new Stack();
        sillas.push(new Silla(12));
        sillas.push(new Silla(15));
        sillas.push(new Silla(1));
        sillas.push(new Silla(5));
        sillas.push(new Silla(7));

        sillas.pop();


        Silla ultima = (Silla) sillas.peek();

        System.out.println(ultima.getNumero());


        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(7);
        stack.add(4);
        stack.add(5);
        stack.add(9);
        stack.add(1);


        stack.addFirst(67);
        stack.addLast(98);

        Iterator i = stack.descendingIterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }









    }
}
