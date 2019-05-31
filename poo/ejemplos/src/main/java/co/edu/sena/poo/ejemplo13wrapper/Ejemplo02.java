package co.edu.sena.poo.ejemplo13wrapper;

public class Ejemplo02 {
    public static void main(String[] args) {
        int a =10;
        Integer aa = a; // autoboxing


        Integer b =10;
        int bb = (Integer)b;// unboxing


        int c =10;
        Integer cc = (int)c;// boxing



        Silla s1 = new Silla();
        s1.setId(1);
        Silla s2 = new Silla();
        s2.setId(1);

        if(s1.getId()== s2.getId()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
