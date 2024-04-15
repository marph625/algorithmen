package OOP.Level_2;

public class Anteil extends Bruch3 {

    public static Bruch3 verteilt = new Bruch3(0);

    // Konstruktoren
    public Anteil() {
        super(0, 1);
    }

    public Anteil(int zaehler, int nenner) {
        super(zaehler, nenner);
        verteilt = verteilt.addiere(new Bruch3(zaehler, nenner));
        if (verteilt.dezimalWert() > 1) {
            System.out.println("Der geforderte Anteil ist nicht möglich!");
            verteilt = verteilt.subtrahiere(new Bruch3(zaehler, nenner));
            setZaehler(0); // Anteil zurücknehmen
        }
    }

    // Set-Methoden



    // Get-Methoden

    public double getVerteilt() {
        return (double) verteilt.getZaehler() / verteilt.getNenner();
    }

    public Bruch3 getRest() {
        Bruch3 alles = new Bruch3(1);
        return alles.subtrahiere(verteilt);
    }


}
