package it.ebegar.calcolatriceGIT.utility;

public class Calcoli {

    //Base
    public static int somma (int a, int b) {
        return a+b;
    }
    // Michele Perillo aggiunta metodo divisione
    public static String divisione (int a, int b){
        String res;

        try {
            res = a / b +"";
        }catch(ArithmeticException e){
            res = "non è possibile dividere un numero per 0";
        }
        return res;
    }
}
