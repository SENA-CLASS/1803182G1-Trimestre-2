package co.edu.sena.javabasico.desiciones;

import java.util.Scanner;

public class Secuenciales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		a = teclado.nextInt();
		if (a == 1) {
			System.out.println("uno");
		}
		if (a == 2) {
			System.out.println("dos");
		}
		if (a == 3) {
			System.out.println("tres");
		}
		if (a == 4) {
			System.out.println("cuatro");
		}
	}

}
