package co.edu.sena.javabasico.casos;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        String b;
        Scanner teclado = new Scanner(System.in);
        b = teclado.next();

        switch (b){
            case "uno":
            case "UNO":
                System.out.println(1);
                break;
            case "dos":
            case "DOS":
                System.out.println(2);
                break;
            case "tres":
            case "TRES":
                System.out.println(3);
                break;
            default:
                System.out.println("no conozco ese numero");
        }

    }
}
