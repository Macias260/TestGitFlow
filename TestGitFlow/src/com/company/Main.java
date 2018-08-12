package com.company;

//              GITFLOW
public class Main {

    public static void main(String[] args) {
        wyswietlTekst("cześć grzesiek");
        int[] testowaTablica = new int[]{3, 4, 5};
        int wynik = sumowanieTablicy(testowaTablica);
        wyswietlTekst(Integer.toString(wynik));
    }

    public static void wyswietlTekst(String tekst) {
        System.out.println("Tekst: " + tekst);

    }

    //    Metoda do sumowania tablicy
    public static int sumowanieTablicy(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        return suma;
    }

}
