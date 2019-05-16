package co.edu.sena.javabasico.arreglos;

import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) {

        int [] arreglo = new int[5];
        Scanner teclado = new Scanner(System.in);



        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println("escriba el valor para el arreglo en posici�n "+i+": ");
            arreglo[i]= teclado.nextInt();
        }
        //ordenamiento de burbuja
        for (int i = 0; i <arreglo.length-1 ; i++) {
            for (int j = i+1; j <arreglo.length ; j++) {
                if(arreglo[i]<arreglo[j]){
                    int burbuja = arreglo[i];
                    arreglo[i]= arreglo[j];
                    arreglo[j]= burbuja;
                }
            }
        }


        for (int i = 0; i < arreglo.length ; i++) {
            System.out.println("[ "+i+" ]: "+arreglo[i]);
        }
    }
}
