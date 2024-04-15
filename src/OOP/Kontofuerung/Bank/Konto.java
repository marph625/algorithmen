package OOP.Kontofuerung.Bank;

public class Konto {
    // Objektvariablen
    private String kontonummer;
    private double kontostand;

    // Klassenvariablen
    private static int kontozaehler;

    // Set-Methoden

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    // Get-Methoden

    public String getKontonummer() {
        return this.kontonummer;
    }

    public double getKontostand() {
        return this.kontostand;
    }

    // Konstruktoren

    public Konto(double kontostand) {
        // String.format("% AnzahlDerNullstellen d", variable)
        this.kontonummer = String.format("%03d",++kontozaehler);
        this.kontostand = kontostand;
        //this.kontozaehler++;
    }

    // Methoden
    public void einzahlen(double betrag_einzahlen) {
        this.kontostand = kontostand + betrag_einzahlen;
        System.out.println("Konto mit der Kontonummer " + this.getKontonummer() + " hat " + betrag_einzahlen + "€ eingezahlt.");
    }

    public void auszahlen(double betrag_auszahlen) {
        this.kontostand = kontostand - betrag_auszahlen;
        System.out.println("Konto mit der Kontonummer " + this.getKontonummer() + " hat " + betrag_auszahlen + "€ abgehoben.");
    }
}
