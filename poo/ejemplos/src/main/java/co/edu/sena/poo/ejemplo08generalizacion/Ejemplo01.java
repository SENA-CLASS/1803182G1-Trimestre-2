package co.edu.sena.poo.ejemplo08generalizacion;

public class Ejemplo01 {
    public static void main(String[] args) {
        AvionetaAcuatica avionetaAcuatica = new AvionetaAcuatica();
        avionetaAcuatica.setMotor(1);
        avionetaAcuatica.setPasajeros(6);

        AvionCarga avionCarga = new AvionCarga();
        avionCarga.prender();

        Avioneta avioneta = new Avioneta();
        avioneta.prender();

        Avion a1 = (Avion)avioneta;



    }

}
