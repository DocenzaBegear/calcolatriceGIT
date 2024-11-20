package it.begear.calcolatriceGIT;

import it.ebegar.calcolatriceGIT.utility.Calcoli;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calcolatrice GIT");
        int a = 10;
        int b = 2;

        System.out.println("Somma: " + Calcoli.somma(a,b));
        System.out.println("Divisione: " + Calcoli.divisione(a,b));
    }
}