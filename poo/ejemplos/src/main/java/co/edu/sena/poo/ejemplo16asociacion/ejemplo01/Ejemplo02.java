package co.edu.sena.poo.ejemplo16asociacion.ejemplo01;

public class Ejemplo02 {
    public static void main(String[] args) {
        Caballo caballo = new Caballo(new Cerebro(2),new Pata[4]);
        caballo.getCerebro().setCaballo(caballo);

        for (int i = 0; i <caballo.getPatas().length ; i++) {
            caballo.getPatas()[i]= new Pata(2);
            caballo.getPatas()[i].setCaballo(caballo);
        }

        caballo.setSillaMontar(new SillaMontar("amarilla"));
        caballo.getSillaMontar().setCaballo(caballo);

        System.out.println(caballo.toString());

    }
}
