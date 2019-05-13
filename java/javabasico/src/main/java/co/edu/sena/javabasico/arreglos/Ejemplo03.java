package co.edu.sena.javabasico.arreglos;

import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        int [] arreglo = new int[4];
        Scanner teclado = new Scanner(System.in);



        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println("escriba el valor para el arreglo en posición "+i+": ");
            arreglo[i]= teclado.nextInt();
        }

        for (int i = 0; i < arreglo.length ; i++) {
            System.out.println("[ "+i+" ]: "+arreglo[i]);
        }


    }
}
