package co.edu.sena.javabasico.mientras;

import java.util.logging.Logger;

public class Ejemplo03 {

    public static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {


        int a = 0;
        while (a <= 10) {
            a++;
            if (a % 2 == 0) {
                LOGGER.info(" es par");
            } else {
                continue;
            }
            LOGGER.info("------------------------------");
        }
    }
}
