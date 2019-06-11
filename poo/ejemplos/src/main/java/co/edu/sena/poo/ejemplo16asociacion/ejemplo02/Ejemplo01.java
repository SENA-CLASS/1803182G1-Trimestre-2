package co.edu.sena.poo.ejemplo16asociacion.ejemplo02;

public class Ejemplo01 {
    public static void main(String[] args) {

        Huevo h1 = new Huevo("rojo","gallina",200);
        Huevo h2 = new Huevo("blanco","paloma",500);
        Huevo h3 = new Huevo("azul","avestruz",5000);
        Huevo h4 = new Huevo("verde","cocodrilo",10000);
        Huevo h5 = new Huevo("amarillos","avion",1000);
        Huevo h6 = new Huevo("cafe","codorniz",50);


        Cubeta c1 = new Cubeta(10,10);
        c1.addHuevo(h1);
        c1.addHuevo(h3);
        c1.addHuevo(h1);
        c1.addHuevo(h5);
        c1.addHuevo(h1);
        c1.addHuevo(h6);
        c1.addHuevo(h1);
        c1.addHuevo(h2);
        c1.addHuevo(h3);
        c1.addHuevo(h4);

        System.out.println(c1.getPrecio());

        c1.removeHuevo(h4);

        System.out.println(c1.getPrecio());

        for (Huevo h:c1.getHuevoList()
             ) {
            System.out.println(h.toString());
        }



    }
}
