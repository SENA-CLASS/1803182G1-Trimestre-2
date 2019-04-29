package co.edu.sena.javabasico.desiciones;

import java.util.Scanner;

public class Cascada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c;
        c = teclado.nextInt();

        if (c == 1) {
            System.out.println("uno");
        } else {
            if (c == 2) {
                System.out.println("dos");
            } else {
                if (c == 3) {
                    System.out.println("tres");
                } else {
                    System.out.println("no se que numero sera");
                }
            }
        }

        // mejor
        if (c == 1) {
            System.out.println("uno");
        } else if (c == 2) {
            System.out.println("uno");
        } else if (c == 3) {
            System.out.println("uno");
        } else if (c == 4) {
            System.out.println("uno");
        } else {
            System.out.println("uno");
        }
    }

}
