package co.edu.sena.poo.ejemplo17equals;

import java.util.Objects;

public class Puerta extends Object {
    private int refencia;
    private String color;
    private double altura;

    public int getRefencia() {
        return refencia;
    }

    public void setRefencia(int refencia) {
        this.refencia = refencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// verifica si los hashcode son iguales
        if (o == null || getClass() != o.getClass()) return false;// que los objetos sean del mismo tipo y que no sena nulls
        Puerta puerta = (Puerta) o;
        return refencia == puerta.refencia &&
                Double.compare(puerta.altura, altura) == 0 &&
                Objects.equals(color, puerta.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refencia, color, altura);
    }
}
