package co.edu.sena.poo.ejemplo16asociacion.ejemplo01;

import java.util.Arrays;

public class Caballo {
    private Cerebro cerebro;
    private Pata [] patas;
    private SillaMontar sillaMontar;

    public Caballo(Cerebro cerebro, Pata[] patas) {
        this.cerebro = cerebro;
        this.patas = patas;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public Pata[] getPatas() {
        return patas;
    }

    public SillaMontar getSillaMontar() {
        return sillaMontar;
    }

    public void setSillaMontar(SillaMontar sillaMontar) {
        this.sillaMontar = sillaMontar;
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "cerebro=" + cerebro +
                ", patas=" + Arrays.toString(patas) +
                ", sillaMontar=" + sillaMontar +
                '}';
    }
}
