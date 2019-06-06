package co.edu.sena.poo.ejemplo16asociacion.ejemplo01;

public class Pata {
    private Caballo caballo;
    private float largo;

    public Pata(float largo) {
        this.largo = largo;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    @Override
    public String toString() {
        return "Pata{" +
                "largo=" + largo +
                '}';
    }
}
