package co.edu.sena.poo.ejemplo14realizacion;

public class Ejemplo01 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.comer();
        p1.dormir();

        Ciego ciego = new Ciego();

        Sordo sordo = new Sordo();

        Mudo mudo = new Mudo();

        Invalido invalido = new Invalido();

        PersonaInterface persona1 = new Ciego();
        CiegoInterface ciego2 = (CiegoInterface) persona1;

        MudoInterface m = new Mudo();
        PersonaInterface po = (PersonaInterface)m;
    }
}
