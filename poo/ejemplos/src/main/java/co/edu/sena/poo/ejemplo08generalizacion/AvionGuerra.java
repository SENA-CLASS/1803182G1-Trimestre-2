package co.edu.sena.poo.ejemplo08generalizacion;

public class AvionGuerra extends Avion {

    @Override
    public void abrirPuertas() {
        System.out.println("cuales puertas cabina");
    }

    public void dispararMetralleta(){
        System.out.println("ban ban");
    }

    public void dispararMisiles(){
        System.out.println("piun piun");
    }

}
