package co.edu.sena.poo.ejemplo18collections;

import java.util.*;

public class Ejemplo01 {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        int [] b = new int[4];

        int cont=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=3){
                b[cont]=a[i];
                cont++;
            }
        }
        a=b;


        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
        System.out.println("-----------------------------------");

        List arreglo = new ArrayList();
        arreglo.add(1);
        arreglo.add(2);
        arreglo.add(3);
        arreglo.add(4);
        arreglo.add(5);

        arreglo.remove(2);

        for (int i = 0; i <arreglo.size() ; i++) {
            System.out.println(arreglo.get(i));
        }


        Vector adsf = new Vector();


        Lapiz [] lapices = new Lapiz[5];
        lapices[0]= new Lapiz();

        int [] r = new int[5];











    }
}
