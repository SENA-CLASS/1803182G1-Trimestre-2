package co.edu.sena.javabasico.para;

public class Ejemplo05 {
    public static void main(String[] args) {

        // escriba los numeros pares del 1 al 100 cada tres pares

        for (int i = 1; i <=100 ;) {

            if(i%2==0){
                System.out.println("el numero "+i +" es par");
                i+=2;
            }
            i++;
        }


    }

}
