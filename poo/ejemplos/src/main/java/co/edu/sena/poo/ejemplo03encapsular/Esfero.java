package co.edu.sena.poo.ejemplo03encapsular;

public class Esfero {
    private String color;
    private String marca;
    private float precio;
    private String colorTinta;

    public Esfero(){
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca= marca;
    }

    public float getPrecio(){
        return this.precio;
    }

    public void setPrecio(float precio){
        this.precio= precio;
    }

    public String getColorTinta(){
        return this.colorTinta;
    }

    public void setColorTinta(String colorTinta){
        this.colorTinta= colorTinta;
    }

}
