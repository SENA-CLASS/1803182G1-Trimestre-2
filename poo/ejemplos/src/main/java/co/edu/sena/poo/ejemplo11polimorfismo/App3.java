package co.edu.sena.poo.ejemplo11polimorfismo;

public class App3 {
    public static void main(String[] args) {
        // relgas de conversion


        MotoCuatroCambios motoCuatroCambios = new MotoCuatroCambios();
        MotoCambios motoCambios = motoCuatroCambios;
        Moto moto = motoCambios;

        System.out.println(motoCuatroCambios);
        System.out.println(motoCambios);
        System.out.println(moto);


        Moto moto1 = new Moto();
        //MotoCambios motoCambios1 = (MotoCambios) moto1;// no se pueden hacer conversiones de arriba hacia abajo


        Moto moto2 = new MotoSeisCambios();
        MotoCambios motoCambios2 = (MotoCambios) moto2;
        MotoSeisCambios motoSeisCambios2= (MotoSeisCambios) motoCambios2;


        MotoSeisCambios motoSeisCambios3 = new MotoSeisCambios();
        motoSeisCambios3.apagar();
        motoSeisCambios3.prender();
        motoSeisCambios3.cambiarVelocidad(7);

        MotoCambios motoCambios3 = new MotoSeisCambios();
        motoCambios3.apagar();
        motoCambios3.prender();
        motoCambios3.cambiarVelocidad(7);

        Moto moto3 = new MotoSeisCambios();
        moto3.apagar();
        moto3.prender();

        MotoSeisCambios m4= new MotoSeisCambios();
        m4.cambiarVelocidad(8);
        m4.prender();
        m4.apagar();
        MotoCambios mc4 = m4;

        Moto mt4 = mc4;


        MotoCambios m5 = (MotoCambios) mt4;










    }
}
