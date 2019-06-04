package co.edu.sena.poo.ejemplo15clasesanidadas.nostatics2;

public class Clase01 {

    public InterfaceClase02 getClase02(){
        return new Clase02();
    }

    private class Clase02 implements InterfaceClase02{

        public InterfaceClase03 getClase03(){
            return new Clase03();
        }

        private class Clase03 implements InterfaceClase03{

            public InterfaceClase04 getClase04(){
                return new Clase04();
            }

            private class Clase04 implements InterfaceClase04{
                
            }
        }
    }
}
