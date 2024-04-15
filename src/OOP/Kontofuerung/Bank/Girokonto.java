package OOP.Kontofuerung.Bank;

public class Girokonto extends Konto{

    // Objektvariable
    // Deklaration von limit
    private double limit;

    // Konstruktor
    public Girokonto(double kontostand, double limit) {
        super(kontostand); // Konto-Konstruktor

        // Initialisierung von limit
        this.limit = limit;
    }

    // Set-Methoden

    public void setLimit(double limit) {
        this.limit = limit;
    }

    // Get-Methoden

    public double getLimit() {
        return this.limit;
    }

    @Override
    public void auszahlen(double betrag_auszahlen) {
        if (this.getKontostand() < betrag_auszahlen) {
            System.out.println("Nicht genug Patte auf der Kante! Checke deinen Kontostand und versuche es erneut.");
        } else if (this.limit < betrag_auszahlen) {
            System.out.println("Kreditlimit wurde überschritten! Ihr Kreditlimit liegt bei: " + this.getLimit());
        }
        else super.auszahlen(betrag_auszahlen);
    }

}
