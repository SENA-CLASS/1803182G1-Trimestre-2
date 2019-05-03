package co.edu.sena.javabasico.casos;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        int a;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();

        switch (a){
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            default:
                System.out.println("no conozco ese numero");
        }

    }
}
