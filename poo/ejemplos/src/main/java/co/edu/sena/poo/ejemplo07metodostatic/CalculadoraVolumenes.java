package co.edu.sena.poo.ejemplo07metodostatic;

public class CalculadoraVolumenes {

    private CalculadoraVolumenes() {
    }

    public static double calcularVolumenEsfera(double radio){
        return 4/3*Math.PI*Math.pow(radio,3);
    }

    public static double calcularVolumenCubo(double arista){
        return Math.pow(arista,3);
    }



}
