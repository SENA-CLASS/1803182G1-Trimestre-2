package co.edu.sena.poo.ejemplo16asociacion.ejemplo01;

public class Ejemplo01 {
    public static void main(String[] args) {
        Cerebro cerebro = new Cerebro(2);
        Caballo caballo = new Caballo(cerebro, new Pata[4]);
        cerebro.setPeso(7);
        System.out.println("---"+caballo.getCerebro().getPeso());


        for (int i = 0; i < caballo.getPatas().length ; i++) {

            caballo.getPatas()[i]= new Pata(1);
            System.out.println(caballo.getPatas()[i].getLargo());
        }

        // aqui el caballo no tiene silla de montar
        System.out.println(caballo.getSillaMontar());
        System.out.println(caballo.getCerebro());
        System.out.println(caballo.getPatas()[0].getLargo());

        // agregamos la silla de montar
        SillaMontar s1 = new SillaMontar("rojo");
        caballo.setSillaMontar(s1);
        System.out.println(caballo.getSillaMontar());
        caballo.setSillaMontar(new SillaMontar("cafe"));
        System.out.println(caballo.getSillaMontar());


    }
}
