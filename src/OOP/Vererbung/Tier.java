package OOP.Vererbung;

public class Tier {

    // Objektvariablen
    private String name;
    private int gebJahr;

    // Klassenvariablen
    private static int anzahlTiere;
    private static int nextNr = 1;

    // Set- und Get-Methoden

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public String getName() {
        return this.name;
    }

    public int getGebJahr() {
        return this.gebJahr;
    }

    public static int getAnzahlTiere() {
        return anzahlTiere;
    }

    // Konstruktoren

    public Tier(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
        this.anzahlTiere = nextNr++;
    }

//    public Tier(String name, int gebJahr) {
//        setName(name);
//        setGebJahr(gebJahr);
//    }

    // Methoden

    public void gibLaut() {
        System.out.println(this.name + " macht Mäh!");
    }
}
