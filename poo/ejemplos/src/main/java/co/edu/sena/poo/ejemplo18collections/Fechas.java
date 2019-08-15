package co.edu.sena.poo.ejemplo18collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Fechas {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);

        LocalDate fecha2 = LocalDate.of(2019,1,1);
        System.out.println(fecha2);


    }
}
