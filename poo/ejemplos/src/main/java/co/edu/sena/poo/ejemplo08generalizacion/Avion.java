package co.edu.sena.poo.ejemplo08generalizacion;

public abstract class Avion {

    private int motor;
    private int pasajeros;

    public abstract void abrirPuertas();

    public void prender(){
        System.out.println("inserta llave");
    }

    public void apagar(){
        System.out.println("quita la llave");
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
