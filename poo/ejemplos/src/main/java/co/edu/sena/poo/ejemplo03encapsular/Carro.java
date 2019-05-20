package co.edu.sena.poo.ejemplo03encapsular;

public class Carro {
    private int velicidad;

    public void acelerar() {
        if (this.velicidad < 200) {
            this.velicidad += 10;
        } else {
            System.out.println("estoy en mi velocidad maxima");
        }
    }

    public void frenar() {
        if (this.velicidad > 0) {
            this.velicidad -= 10;
        }else{
            System.out.println("no puedo frenar mas");
        }
    }

    public int getVelicidad() {
        return velicidad;
    }
}
