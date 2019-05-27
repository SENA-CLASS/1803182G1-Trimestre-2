package co.edu.sena.poo.ejemplo09dependencia.abstractfactory;

public class App {
    public static void main(String[] args) {
        Casa casa = Factory.getCasa();
        Ciudad ciudad= Factory.getCiudad();

    }
}
