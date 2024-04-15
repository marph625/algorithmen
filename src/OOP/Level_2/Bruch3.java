package OOP.Level_2;

public class Bruch3 {
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
    public Bruch3() { // Standardkonstruktor
        // Konstruktor mit 2 Parametern aufrufen
        this(0, 1); // zaehler = 0, nenner = 1
    }

    public Bruch3(int zaehler) { // Konstruktor mit 1 Parameter
        this(zaehler, 1); // ruft den Konstruktor in übernächster Zeile auf
    }

    public Bruch3(int zaehler, int nenner) { // Konstruktor mit 2 Parametern
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

    public double dezimalWert() {
        return (double) zaehler / nenner;
    }

    public void ausgeben() { // Methode ohne Rückgabewert, siehe void
        System.out.println(this.zaehler + "/" + this.nenner);
    }

    // Klassenmethode zum Lesen der Klassenvariable anzahlBrueche
    // Eine Set Methode ist nicht vorgesehen
    public static int getAnzahlBrueche() {
        return anzahlBrueche;
    }

    // gibt anstelle des Speicherortes den tatsächlichen String zurück
    @Override
    public String toString(){
        return String.valueOf(zaehler + " / " + nenner);
    }

    // Methoden zur Durchführung einfacher mathematischer Operationen

    // Addition
    public Bruch3 addiere(Bruch3 ba) {
        int z = (this.zaehler * ba.getNenner()) + (this.nenner * ba.getZaehler());
        int n = this.nenner * ba.getNenner();
        Bruch3 e = new Bruch3(z, n);
        e.kuerzen();
        return e;
    }

    // Subtraktion
    public Bruch3 subtrahiere(Bruch3 bs) {
        int z = (this.zaehler * bs.getNenner()) - (this.nenner * bs.getZaehler());
        int n = this.nenner * bs.getNenner();
        Bruch3 e = new Bruch3(z, n);
        e.kuerzen();
        return e;
    }

    // Multiplikation
    public Bruch3 multipliziere(Bruch3 bm) {
        int z = this.zaehler * bm.getZaehler();
        int n = this.nenner * bm.getNenner();
        Bruch3 e = new Bruch3(z, n);
        e.kuerzen();
        return e;
    }

    // Division
    public Bruch3 dividiere(Bruch3 bd) {
        int z = this.zaehler * bd.getNenner();
        int n = this.nenner * bd.getZaehler();
        Bruch3 e = new Bruch3(z, n);
        e.kuerzen();
        return e;
    }
}

