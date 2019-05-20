package co.edu.sena.poo.ejemplo03encapsular;

public class Tablero {
    private String color;
    private float size;
    private String material;

    /**
     * Metodo accesor(getter) del atributo color
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Metodo mutador(setter) del atributo color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo accesor(getter) del atributo size
     *
     * @return size
     */
    public float getSize() {
        return this.size;
    }

    /**
     * Metodo mutador(setter) del atributo size
     *
     * @param size
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * Metodo accesor(getter) del atributo material
     *
     * @return material
     */

    public String getMaterial() {
        return this.material;
    }

    /**
     * Metodo mutador(setter) del atributo material
     *
     * @param material
     */

    public void setMaterial(String material){
        this.material = material;
    }


}
