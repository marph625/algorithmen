package OOP.Kontofuerung.Bank;

import java.sql.SQLOutput;

public class Kontotest {
    public static void main(String[] args) {
        Konto k1 = new Konto(1000);
        Konto k2 = new Konto(2000);
        Konto k3 = new Konto(3000);
        Girokonto g1 = new Girokonto(4000, 3000);

        Konto[] konten = {k1, k2, k3};

        for (Konto konto : konten) {
            System.out.println("Kontonummer: " + konto.getKontonummer() + "\nKontostand: " + konto.getKontostand());
        }

        // Testfall 1
        k1.einzahlen(300);
        k2.auszahlen(500);
        k3.auszahlen(1000);

        for (Konto konto : konten) {
            System.out.println("Kontonummer: " + konto.getKontonummer() + "\nKontostand: " + konto.getKontostand());
        }

        // Testausgabe für Girokonto g1
        System.out.println("\nGirokonto mit der Nummer: " + g1.getKontonummer() + "\nKontostand: " + g1.getKontostand() + "\nLimit: " + g1.getLimit() );
        g1.auszahlen(3001);
        System.out.println("\nGirokonto mit der Nummer: " + g1.getKontonummer() + "\nKontostand: " + g1.getKontostand() + "\nLimit: " + g1.getLimit() );
    }
}
