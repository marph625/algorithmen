package OOP.Level_1;
// Überarbeitete Version um korrekte Bruch-Parameter zu nutzen

public class Bruch2 {
    private int zaehler; // Objektvariable
    private int nenner; // Objektvariable



    // Set Methoden
    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner) {
        if (nenner != 0) { // Nenner darf nicht 0 sein!
            this.nenner = nenner;
        } else this.nenner = 1;
    }

    // Get Methoden



    // Konstruktoren
    public Bruch2(){ // Standardkonstruktor
        this(0,1);
    }

    public Bruch2(int zaehler) { // Konstruktor mit 1 Parameter
        this(zaehler, 1); // ruft den Konstruktor in übernächster Zeile auf
    }

    public Bruch2(int zaehler, int nenner) { // Konstruktor mit 2 Parametern
        setZaehler(zaehler);    // Aufruf der Set-Methoden
        setNenner(nenner);
    }

    // Methoden
    void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    void kuerzen() {
        var m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
        var n = Math.abs(nenner); // speichert in m den Betrag von nenner
        var r = m % n;

        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }

        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }

    void gekuerztAusgeben() {
        kuerzen();
        ausgeben();
    }
}
