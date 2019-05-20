package co.edu.sena.javabasico.arreglos;

public class Ejemplo05 {
    public static void main(String[] args) {
        int [] a = {11,22,33,44,55,66,77,88};
        System.out.println("longitud "+a.length);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

        String [] nombres = {"juan","pedro","antonio", "enrirque"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        Object [] arreglo = {new Vaca(),new Burro()};

        for (int i = 0; i < arreglo.length ; i++) {
            System.out.println(arreglo[i].getClass().getCanonicalName());
        }

    }
}
