package co.edu.sena.javabasico.prodecidimental.funciones;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {

        double a, b, r;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        r = velocidadPromedioAceleracionConstante(a, b);
        System.out.println(r);


    }

    public static double velocidadPromedioAceleracionConstante(double velocidadInicial, double velocidadFinal){
        return (velocidadInicial+velocidadFinal)/2;
    }



}
