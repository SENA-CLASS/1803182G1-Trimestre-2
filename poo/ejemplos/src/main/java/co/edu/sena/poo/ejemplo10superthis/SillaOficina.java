package co.edu.sena.poo.ejemplo10superthis;

public class SillaOficina extends Silla {

    private int ruedas;

    public SillaOficina(int patas, String color, int ruedas) {
        super(patas, color);// llamado al constructor de la clase padre
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
