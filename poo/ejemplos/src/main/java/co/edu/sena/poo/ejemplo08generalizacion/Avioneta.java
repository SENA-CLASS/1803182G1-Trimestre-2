package co.edu.sena.poo.ejemplo08generalizacion;

public class Avioneta extends Avion {

    @Override
    public void abrirPuertas() {
        System.out.println("abro la puertas haci arriba");
    }

    @Override
    public void prender() {
        System.out.println("huella, retina del ojo");
    }

    @Override
    public void apagar() {
        System.out.println("boton de apagado    ");
    }
}
