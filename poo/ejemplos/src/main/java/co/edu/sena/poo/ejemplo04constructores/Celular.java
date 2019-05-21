package co.edu.sena.poo.ejemplo04constructores;

public class Celular {
    private String marca;
    private String referencia;
    private float precio;

    // este es un constructor por defecto que si no hay ningun constructor lo coloca al compilar
    public Celular() {

    }

    public Celular(String marca) {
        this.marca = marca;
    }

    public Celular(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public Celular(String marca, String referencia) {
        this.marca = marca;
        this.referencia = referencia;
    }

    public Celular(String marca, String referencia, float precio) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }

    public Celular(String referencia, float precio, String marca) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }

    public Celular( float precio, String marca, String referencia) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }





    public Celular(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
