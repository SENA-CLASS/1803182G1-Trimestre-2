package co.edu.sena.poo.ejemplo08generalizacion;

public class AvionPasajeros extends Avion {
    private int puestos;
    private int bathrooms;

    @Override
    public void abrirPuertas() {
        System.out.println("abre la puerta y despliegua la escalera");
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
