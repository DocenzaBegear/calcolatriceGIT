package it.ebegar.calcolatriceGIT.utility;

public class Calcoli {

    //Base
    public static int somma(int a, int b) {
        return a + b;
    }

//MB aggiunto metodo moltiplicazione 3 interi
    public static int moltiplicazione(int a, int b, int c) {
        return a * b * c;
}
  
    /**
     * @param base      Base della potenza
     * @param esponente Esponente della potenza
     * @return base elevata all'esponente
     * @author Riccardo Roman
     */
    public static int potenza(int base, int esponente) {
        return (int) Math.pow(base, esponente);
    }
}
