package co.edu.sena.poo.ejemplo17equals;

public class Ejemplo01 {
    public static void main(String[] args) {
        Puerta p1 = new Puerta();
        p1.setRefencia(234);
        p1.setColor("cafe");
        p1.setAltura(200);

        Puerta p2 = p1;
        p2.setRefencia(234);
        p2.setColor("cafe");
        p2.setAltura(200);

        System.out.println(p1==p2);
        System.out.println(p1);
        System.out.println(p2);
        //aqui son los mismo objetos apuntan a la diferente dirección de memoria, pero tienen el mismo hashcode

        System.out.println(p1.equals(p2));

        p2.setColor("morado");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        // parece que el p2 cambio su
        System.out.println(p1);
        System.out.println(p2);
        // cambio la direccion de memoria debido a que el hashcode
        System.out.println(p1.equals(p2));

        Puerta p3 = new Puerta();
        p3.setRefencia(234);
        p3.setColor("cafe");
        p3.setAltura(200);

        System.out.println(p3.equals(p1));
        System.out.println(p3.equals(p2));
        System.out.println(p3.equals(null));

        Casa c1 = new Casa();
        c1.setMatricula("123");
        Apartamento a1 = new Apartamento();
        a1.setMatricula("123");
        System.out.println(c1.hashCode());
        System.out.println(a1.hashCode());


        System.out.println(c1.equals(a1));





    }
}
