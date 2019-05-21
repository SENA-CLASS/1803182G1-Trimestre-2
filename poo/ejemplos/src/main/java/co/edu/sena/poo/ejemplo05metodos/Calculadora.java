package co.edu.sena.poo.ejemplo05metodos;

public class Calculadora {

    public void sumar(int a, int b){
        System.out.println(a+b);
    }

    public void sumar(int a, float b){
        float resultado= a+b;
        System.out.println(a+b);
    }

    public void sumar(float a, float b){
        System.out.println(a+b);
    }

    public void sumar(String a, String b){
        float resultado = Float.parseFloat(a)+Float.parseFloat(b);
        System.out.println(resultado);
    }

}
