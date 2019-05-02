package co.edu.sena.javabasico.casos;

import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        char b;
        Scanner teclado = new Scanner(System.in);
        b = teclado.next().charAt(0);

        switch (b){
            case 'a':
            case 'A':{
                System.out.println("es la A o a");
                break;
            }
            case 'b':
            case 'B':{
                System.out.println("es la B o b");
                break;
            }
            case 'o':
            case 'O':{
                System.out.println("es la O o o");
                break;
            }
            default: {
                System.out.println("no conozco esa letra");
            }
        }
    }
}
