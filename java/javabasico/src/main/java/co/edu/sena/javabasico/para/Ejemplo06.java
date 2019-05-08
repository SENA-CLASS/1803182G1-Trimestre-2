package co.edu.sena.javabasico.para;

public class Ejemplo06 {
    public static void main(String[] args) {
        // mostar el quinto numero primo que hay de los numero del 1 a 100

        int con=0;
        int conPrimo;

        for (int i = 1; i <=100 ; i++) {
            conPrimo=0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0)
                    conPrimo++;
            }
            if(conPrimo==2)
                con++;

            if(con==5){
                System.out.println("el quinto numero primo es:" + i);
                break;
            }

        }



    }
}
