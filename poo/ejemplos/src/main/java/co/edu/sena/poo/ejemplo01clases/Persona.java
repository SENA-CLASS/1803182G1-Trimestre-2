package co.edu.sena.poo.ejemplo01clases;

import java.util.logging.Logger;

public class Persona {

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private float altura;
    private char sexo;
    private float peso;
    private String personalidad;

    public Persona() {
        LOGGER.info("naci");
    }

    public void correr(){
        LOGGER.info("estoy corriendo");

    }

    public void ver(){
        LOGGER.info("puedo ver");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }
}
