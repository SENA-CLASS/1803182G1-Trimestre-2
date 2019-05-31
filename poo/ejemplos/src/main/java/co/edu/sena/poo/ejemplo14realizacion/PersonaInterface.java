package co.edu.sena.poo.ejemplo14realizacion;

public interface PersonaInterface {
    default void comer(){
        System.out.println("somos omnivoro");
    }
    default void dormir(){
        System.out.println("ZzzzZZzzzzZzzz");
    }
}
