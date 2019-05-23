package co.edu.sena.javabasico.arreglos;

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {
		int [] a = new int[1000];
		
		Scanner teclado = new Scanner(System.in);
		
		
		for (int i = 0; i < a.length; i++) {
			a[i]= teclado.nextInt();
		}
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		
		

	}

}
