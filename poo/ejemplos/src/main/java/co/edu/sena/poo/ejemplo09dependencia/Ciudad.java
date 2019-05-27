package co.edu.sena.poo.ejemplo09dependencia;

public class Ciudad {
    private Casa [] casas;

    public Ciudad() {
        this.casas = new Casa[100];
    }

    public Casa[] getCasas() {
        return casas;
    }

    public void setCasas(Casa[] casas) {
        this.casas = casas;
    }
}
