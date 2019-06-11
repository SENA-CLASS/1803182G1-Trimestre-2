package co.edu.sena.poo.ejemplo16asociacion.ejemplo02;

import java.util.Objects;

public class Huevo {
    private String color;
    private String animal;
    private double precio;

    public Huevo(String color, String animal, double precio) {
        this.color = color;
        this.animal = animal;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Huevo huevo = (Huevo) o;
        return Double.compare(huevo.precio, precio) == 0 &&
                Objects.equals(color, huevo.color) &&
                Objects.equals(animal, huevo.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, animal, precio);
    }

    @Override
    public String toString() {
        return "Huevo{" +
                "color='" + color + '\'' +
                ", animal='" + animal + '\'' +
                ", precio=" + precio +
                '}';
    }
}
