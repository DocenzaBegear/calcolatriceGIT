package it.begear.calcolatriceGIT;

import it.ebegar.calcolatriceGIT.utility.Calcoli;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calcolatrice GIT");

        int a = 1;
        int b = 2;

        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println("Somma di due numeri: " + Calcoli.somma(a, b));
        System.out.println("Somma di cinque numeri: " + Calcoli.somma(a, b, c, d, e));
    }
}