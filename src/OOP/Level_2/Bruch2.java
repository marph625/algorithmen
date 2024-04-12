package OOP.Level_2;

public class Bruch2 {
    private int zaehler; // Objektvariable
    private int nenner; // Objektvariable
    private static int anzahlBrueche; // Klassenvariable

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
    public int getZaehler() {
        return this.zaehler;
    }

    public int getNenner() {
        return this.nenner;
    }

    // Konstruktoren
    public Bruch2() { // Standardkonstruktor
        // Konstruktor mit 2 Parametern aufrufen
        this(0, 1); // zaehler = 0, nenner = 1
    }

    public Bruch2(int zaehler) { // Konstruktor mit 1 Parameter
        this(zaehler, 1); // ruft den Konstruktor in übernächster Zeile auf
    }

    public Bruch2(int zaehler, int nenner) { // Konstruktor mit 2 Parametern
        anzahlBrueche++;
        setZaehler(zaehler);    // Aufruf der Set-Methoden
        setNenner(nenner);
    }

    // Methoden

    public void erweitern(int faktor) {
        zaehler *= faktor;
        nenner *= faktor;
    }

    // Klassenmethode, siehe static
    // Steht auch ohne Objekt zur Verfügung
    // Aufruf mit Bruch2.ggT(..., ...)
    public static int ggT(int m, int n) {
        m = Math.abs(m); // speichert in m den Betrag von zaehler
        n = Math.abs(n); // speichert in m den Betrag von nenner
        int r = m % n;

        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
    public void kuerzen() {
        int teiler = ggT(zaehler, nenner);

        zaehler /= teiler; // in n steht jetzt der ggT
        nenner /= teiler;
    }

    public void ausgeben() { // Methode ohne Rückgabewert, siehe void
        System.out.println(this.zaehler + "/" + this.nenner);
    }

    // Klassenmethode zum Lesen der Klassenvariable anzahlBrueche
    // Eine Set Methode ist nicht vorgesehen
    public static int getAnzahlBrueche() {
        return anzahlBrueche;
    }
}
