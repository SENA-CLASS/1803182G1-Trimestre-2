package co.edu.sena.poo.ejemplo02atributos;

 public class Perro {
    private String sexo;
    public String color ;
    float precio ;
    protected int patas;

    public void mostrarSexo(){
        System.out.println(this.sexo);
    }

    public void cambiarSexo(String sexo){
        this.sexo=sexo;
    }

}
