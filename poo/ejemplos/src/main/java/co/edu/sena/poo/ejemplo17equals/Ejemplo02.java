package co.edu.sena.poo.ejemplo17equals;

public class Ejemplo02 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setTipoDocumento("CC");
        c1.setNumeroDocumento("12345");
        c1.setNombre("pedrito");

        Cliente c2 = new Cliente();
        c2.setTipoDocumento("TI");
        c2.setNumeroDocumento(null);
        c2.setNombre("pedrito");

        System.out.println(c1.equals(c2));


    }
}
