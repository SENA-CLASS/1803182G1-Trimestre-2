package co.edu.sena.javabasico.arreglos;

public class Ejemplo02 {
    public static void main(String[] args) {
        int [] arreglo= new int[10];

        arreglo[0]=1;
        arreglo[1]=2;
        arreglo[2]=3;
        arreglo[3]=4;
        arreglo[4]=5;
        arreglo[5]=6;
        arreglo[6]=7;
        arreglo[7]=8;
        arreglo[8]=9;
        arreglo[9]=10;
        System.out.println(arreglo.length);
        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println(arreglo[i]);
        }

        boolean [] arreglo2 = new boolean[10];
        for (int i = 0; i <arreglo2.length ; i++) {
            System.out.println(arreglo2[i]);
        }

        char [] arreglo3 = new char[10];
        for (int i = 0; i < arreglo3.length ; i++) {
            System.out.println((int)arreglo3[i]);
        }


    }

}
