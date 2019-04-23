package co.edu.sena.holamundo;

import java.util.logging.Logger;

public class HolaMundo {
	
	private static final Logger LOG = Logger.getLogger(HolaMundo.class.getName());

	public static void main(String[] args) {
		System.out.println("hola mundo"); // escibir en la consola hace un salto linea
		System.out.print("segunda linea");
		System.out.print("tercar linea");
		System.out.println("asdfasdf"+"asdfadfsf");// concatenar
		
		LOG.info("hola mundo");
	}

}
