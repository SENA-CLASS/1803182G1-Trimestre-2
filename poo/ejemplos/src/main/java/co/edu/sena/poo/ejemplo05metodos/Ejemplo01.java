package co.edu.sena.poo.ejemplo05metodos;

public class Ejemplo01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.sumar(1,2);
        calculadora.sumar(2,4.6F);
        calculadora.sumar("4.6", "7.9");

        int a=15;
        int b=15;

        System.out.println(Math.max(a,b));
    }
}
