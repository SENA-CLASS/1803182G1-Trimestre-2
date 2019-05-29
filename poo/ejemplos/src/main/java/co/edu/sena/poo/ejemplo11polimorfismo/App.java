package co.edu.sena.poo.ejemplo11polimorfismo;

public class App {
    public static void main(String[] args) {
        Cuatrimoto cuatrimoto = new Cuatrimoto();
        ejecutarMetodos(cuatrimoto);

        MotoAcuatica motoAcuatica = new MotoAcuatica();
        ejecutarMetodos(motoAcuatica);

        MotoAutomatica motoAutomatica = new MotoAutomatica();
        ejecutarMetodos(motoAutomatica);

        MotoCambios motoCambios = new MotoCambios();
        ejecutarMetodos(motoCambios);

        Moto moto = new MotoCambios();
        System.out.println(moto.hashCode());
        System.out.println(moto.getClass().getCanonicalName());
        MotoCambios motoCambios1 =(MotoCambios)moto;
        System.out.println(motoCambios1.hashCode());


    }

    public static void ejecutarMetodos(Moto moto){
        if(moto instanceof Moto) {
            ((Moto)moto).prender();
            ((Moto)moto).apagar();
        }
        if(moto instanceof MotoCambios){
            ((MotoCambios)moto).cambiarVelocidad(5);
        }
        if(moto instanceof MotoAcuatica){
            ((MotoAcuatica)moto).flotar();
        }


    }

}
