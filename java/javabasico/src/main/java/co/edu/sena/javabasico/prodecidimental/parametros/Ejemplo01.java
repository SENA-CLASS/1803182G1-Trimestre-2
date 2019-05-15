package co.edu.sena.javabasico.prodecidimental.parametros;

public class Ejemplo01 {

    public static void main(String[] args) {
        int a=10;
        sumarDos(a);// pasar el parametro por valor
        System.out.println("fuera de la fucnion:"+a);
    }

    public static void sumarDos(int a){// parametro por valor
        a=a+2;
        System.out.println("dentro de la funcion a: "+a);
    }
}
