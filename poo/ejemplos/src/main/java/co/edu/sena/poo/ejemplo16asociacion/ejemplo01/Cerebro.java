package co.edu.sena.poo.ejemplo16asociacion.ejemplo01;

public class Cerebro {
    private Caballo caballo;
    private float peso;

    public Cerebro(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    @Override
    public String toString() {
        return "Cerebro{" +
                "peso=" + peso +
                '}';
    }
}
