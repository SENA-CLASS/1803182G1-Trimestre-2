package co.edu.sena.javabasico.prodecidimental.procedimientos;

import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        int [] a = new int[10];
        leerVector(a);
        odernarBurbuja(a);
        imprimirVector(a);
    }

    public static void imprimirVector(int [] vector){
        for (int i = 0; i <vector.length; i++) {
            System.out.println("["+i+"]: "+vector[i]);
        }
    }

    public static void leerVector(int [] vector){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i <vector.length ; i++) {
            System.out.print("["+i+"]: ");
            vector[i]= teclado.nextInt();
        }
    }

    public static void odernarBurbuja(int [] arreglo){
        for (int i = 0; i <arreglo.length-1 ; i++) {
            for (int j = i+1; j <arreglo.length ; j++) {
                if(arreglo[i]>arreglo[j]){
                    int burbuja = arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j]= burbuja;
                }
            }
        }
    }
}
