package co.edu.sena.javabasico.tipodatos;

public class Reales {

	public static void main(String[] args) {
		// Reales, coma flontate
		
		
		// float
		float realCorto = 4.78F;
		System.out.println("valor: " + realCorto);
		System.out.println("tamaño bit: " + Float.SIZE);
		System.out.println("tamaño minimo: " + Float.MIN_VALUE);
		System.out.println("tamaño maximo: " + Float.MAX_VALUE);
		System.out.println("tamaño en bytes: " + Float.BYTES);
		System.out.println("type: " + Float.TYPE);
		
		System.out.println("---------------------------------------------");
		
		
		
		double realLargo= 3434534534534.7;
		System.out.println("valor: " + realLargo);
		System.out.println("tamaño bit: " + Double.SIZE);
		System.out.println("tamaño minimo: " + Double.MIN_VALUE);
		System.out.println("tamaño maximo: " + Double.MAX_VALUE);
		System.out.println("tamaño en bytes: " + Double.BYTES);
		System.out.println("type: " + Double.TYPE);

	}

}
