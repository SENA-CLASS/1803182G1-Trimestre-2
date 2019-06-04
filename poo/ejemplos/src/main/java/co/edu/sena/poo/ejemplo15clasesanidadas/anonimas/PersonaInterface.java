package co.edu.sena.poo.ejemplo15clasesanidadas.anonimas;

public interface PersonaInterface {
    default void comer(){
        System.out.println("somos omnivoro");
    }
    default void dormir(){
        System.out.println("ZzzzZZzzzzZzzz");
    }
}
