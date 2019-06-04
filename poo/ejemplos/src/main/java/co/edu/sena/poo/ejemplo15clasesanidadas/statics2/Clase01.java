package co.edu.sena.poo.ejemplo15clasesanidadas.statics2;

public class Clase01 {

    public static InterfaceClase02 getClase02(){
        return new Clase02();
    }

    public static class Clase02 implements InterfaceClase02{

        public static InterfaceClase03 getClase03(){
            return new Clase03();
        }

        public static class Clase03 implements InterfaceClase03{

            public static InterfaceClase04 getClase04(){
                return new Clase04();
            }

            public static class Clase04 implements InterfaceClase04{

            }
        }
    }
}
