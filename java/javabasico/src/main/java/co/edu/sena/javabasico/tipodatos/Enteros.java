package co.edu.sena.javabasico.tipodatos;

public class Enteros {

	public static void main(String[] args) {
		// estos son los enteros en java
		
		final String valor = "valor: ";

		// primer tipo byte
		byte numeroEnteroMasPequenio = 4;
		System.out.println(valor + numeroEnteroMasPequenio);
		System.out.println("tamaño bit: " + Byte.SIZE);
		System.out.println("tamaño minimo: " + Byte.MIN_VALUE);
		System.out.println("tamaño maximo: " + Byte.MAX_VALUE);
		System.out.println("tamaño en bytes: " + Byte.BYTES);
		System.out.println("type: " + Byte.TYPE);
		System.out.println("---------------------------------------------");
		// tipo de dato short
		short numeroEnteroCorto = 45;
		System.out.println(valor + numeroEnteroCorto);
		System.out.println("tamaño bit: " + Short.SIZE);
		System.out.println("tamaño minimo: " + Short.MIN_VALUE);
		System.out.println("tamaño maximo: " + Short.MAX_VALUE);
		System.out.println("tamaño en bytes: " + Short.BYTES);
		System.out.println("type: " + Short.TYPE);
		System.out.println("---------------------------------------------");
		// tipo de dato short
		int enteroNormal = 100;
		System.out.println(valor + enteroNormal);
		System.out.println("tamaño bit: " + Integer.SIZE);
		System.out.println("tamaño minimo: " + Integer.MIN_VALUE);
		System.out.println("tamaño maximo: " + Integer.MAX_VALUE);
		System.out.println("tamaño en bytes: " + Integer.BYTES);
		System.out.println("type: " + Integer.TYPE);
		System.out.println("---------------------------------------------");
		// tipo de dato long
		long enteroLargo = 10057867687L;// literal
		System.out.println(valor + enteroLargo);
		System.out.println("tamaño bit: " + Long.SIZE);
		System.out.println("tamaño minimo: " + Long.MIN_VALUE);
		System.out.println("tamaño maximo: " + Long.MAX_VALUE);
		System.out.println("tamaño en bytes: " + Long.BYTES);
		System.out.println("type: " + Long.TYPE);
		System.out.println("---------------------------------------------");

	}

}
