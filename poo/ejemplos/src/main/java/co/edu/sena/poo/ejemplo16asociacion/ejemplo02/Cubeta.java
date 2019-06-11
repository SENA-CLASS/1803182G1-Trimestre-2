package co.edu.sena.poo.ejemplo16asociacion.ejemplo02;

import java.util.ArrayList;
import java.util.List;

public class Cubeta {
    private int size;
    private double precio;
    private List<Huevo> huevoList;

    public Cubeta(int size, double precio) {
        this.size = size;
        this.precio = precio;
        this.huevoList = new ArrayList<>();
    }

    public void addHuevo(Huevo huevo){
        if(this.huevoList.size()<this.size){
            this.huevoList.add(huevo);
            this.precio+=huevo.getPrecio();
        }else{
            System.out.println("cubeta llena");
        }
    }

    public void removeHuevo(Huevo huevo){
        if(this.huevoList.contains(huevo)){
            int posicionHuevo = this.huevoList.indexOf(huevo);
            Huevo ht = this.huevoList.get(posicionHuevo);
            this.huevoList.remove(posicionHuevo);
            this.precio-=ht.getPrecio();
        }else{
            System.out.println("en esta cubeta no hay de ese huevo");
        }
    }

    public int getSize() {
        return size;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Huevo> getHuevoList() {
        return huevoList;
    }

    public void setHuevoList(List<Huevo> huevoList) {
        this.huevoList = huevoList;
    }
}
