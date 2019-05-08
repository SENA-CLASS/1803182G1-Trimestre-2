package co.edu.sena.javabasico.para;

import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class Ejemplo04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int cont=0;

        for (;numero!=0;){
            cont++;
            numero= numero /10;
        }

        System.out.println("el numero que escribió tiene "+ cont+ " dígitos");




    }


}
