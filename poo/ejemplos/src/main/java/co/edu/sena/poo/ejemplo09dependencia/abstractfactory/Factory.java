package co.edu.sena.poo.ejemplo09dependencia.abstractfactory;

public class Factory {

    private Factory() {
    }

    public static Casa getCasa(){
        return new Casa();
    }

    public static Ciudad getCiudad(){
        return new Ciudad();
    }

}
