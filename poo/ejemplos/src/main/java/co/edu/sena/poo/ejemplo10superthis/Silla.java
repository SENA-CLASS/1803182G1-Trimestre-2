package co.edu.sena.poo.ejemplo10superthis;

public class Silla {
    private int patas;
    private String color;

    public Silla(int patas, String color) {
        this.patas = patas;
        this.color = color;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
