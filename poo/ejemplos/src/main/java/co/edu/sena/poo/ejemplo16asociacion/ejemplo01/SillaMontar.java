package co.edu.sena.poo.ejemplo16asociacion.ejemplo01;

public class SillaMontar {
    private String color;
    private Caballo caballo;

    public SillaMontar(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    @Override
    public String toString() {
        return "SillaMontar{" +
                "color='" + color + '\'' +
                '}';
    }
}
