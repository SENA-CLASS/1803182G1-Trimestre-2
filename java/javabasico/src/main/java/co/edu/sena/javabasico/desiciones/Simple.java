package co.edu.sena.javabasico.desiciones;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		a = teclado.nextInt();

		if ((a+2) >= 5 ) {
			System.out.println("mayor o igual a 5");
		} else {
			System.out.println("menor a 5");
		}

	}

}
