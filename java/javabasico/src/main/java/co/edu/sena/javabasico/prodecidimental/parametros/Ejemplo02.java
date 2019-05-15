package co.edu.sena.javabasico.prodecidimental.parametros;

public class Ejemplo02 {
    public static void main(String[] args) {

        int [] a= {1,2,3,4,5};
        sumarDos(a);// ojo este se pasa por referencia
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void sumarDos(int [] a){// parametro por referencia
        for (int i = 0; i <a.length ; i++) {
            a[i]= a[i]+1;
        }
    }

}
