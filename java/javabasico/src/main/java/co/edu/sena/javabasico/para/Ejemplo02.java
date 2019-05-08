package co.edu.sena.javabasico.para;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero+ " * "+ i + " = " +(i*numero));
        }


    }
}
