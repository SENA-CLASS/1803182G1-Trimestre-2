package co.edu.sena.poo.ejemplo06atributostatic;

public class Ejemplo01 {
    public static void main(String[] args) {
        Fisica.a =4;
        System.out.println(Fisica.a);
        Fisica.a = 10;
        System.out.println(Fisica.a);

        System.out.println(Fisica.VELOCIDAD_LUZ);

        Carro carro1 = new Carro();
        carro1.arrancar();




    }
}
