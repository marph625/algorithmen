package OOP.Vererbung;

public class Tier {

    // Objektvariablen
    private String name;
    private int gebJahr;

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

    // Konstruktoren

    public Tier(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
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
