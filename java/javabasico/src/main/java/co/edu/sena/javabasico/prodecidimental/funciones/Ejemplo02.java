package co.edu.sena.javabasico.prodecidimental.funciones;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        int op;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1. area cuadro");
            System.out.println("2. area rectangulo");
            System.out.println("3. area triangulo");
            System.out.println("4. area circulo");
            System.out.println("5. salir");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    double a;
                    a = teclado.nextDouble();
                    System.out.println(areaCuadro(a));
                    break;
                case 2:
                    double c, b;
                    c = teclado.nextDouble();
                    b = teclado.nextDouble();
                    System.out.println(areaRectangulo(c, b));
                    break;
                case 3:
                    double c1, b1;
                    c1 = teclado.nextDouble();
                    b1 = teclado.nextDouble();
                    System.out.println(areaTriangulo(c1, b1));
                    break;
                case 4:
                    double r;
                    r = teclado.nextDouble();
                    System.out.println(areaCirculo(r));
                    break;
                case 5:
                    System.out.println("gracias por usar este aplicativo");
                    break;
                default:
                    System.out.println("opción invalida");
            }
        } while (op != 5);


    }

    public static double areaCuadro(double lado) {
        return lado * lado;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
