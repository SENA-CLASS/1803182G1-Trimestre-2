package co.edu.sena.javabasico.desiciones;

import java.util.Scanner;

public class Anidada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a= teclado.nextInt();

        if(a>0){
            if (a%2==0){
                System.out.println("el numero es positivo y es par");
            }else{
                System.out.println("el numero es positivo y es impar");
            }
        }else{
            if(a%2==0){
                System.out.println("el numeor es negativo y es par");
            }else{
                System.out.println("el numero es negativo y es impar");
            }
        }

    }
}
