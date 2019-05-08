package co.edu.sena.javabasico.hagamientras;

public class Ejemplo03 {
    public static void main(String[] args) {

        int a = 0;
       do {
            a++;
            if (a % 2 == 0) {
                System.out.println(" es par");
            } else {
                System.out.println("paso por aca");
                continue;
            }
            System.out.println("------------------------------");
        } while (a <= 10);
    }
}
