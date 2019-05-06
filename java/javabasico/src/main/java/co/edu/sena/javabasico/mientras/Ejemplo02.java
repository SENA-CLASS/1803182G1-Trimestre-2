package co.edu.sena.javabasico.mientras;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejemplo02 {

    public static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        int a=0;
        while(a<=10){
            LOGGER.info("hola mundo "+ a);
            a++;
        }

        int b=1;
        while(true){
            if(b>=10)
                break;
            LOGGER.info("hola mundo "+ b);
            b++;
        }
    }

}
