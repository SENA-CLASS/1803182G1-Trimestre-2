package co.edu.sena.javabasico.arreglos;

import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        int fila = 5; 
        int columna =10;
        int [][] matriz = new int[fila][columna];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("["+i+"],["+j+"]:");
                matriz[i][j]= teclado.nextInt();
            }
        }
        teclado.close();

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("["+i+"],["+j+"]: "+matriz[i][j]);
            }
        }

        for (int i = 0; i < fila; i++) {
            System.out.print("[");
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("]");
        }


    }
}
