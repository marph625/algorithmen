package OOP.Level_2;

public class Bruchtest2 {
    public static void main(String[] args) {
        System.out.println("Beginn - Anzahl Brüche: " + Bruch2.getAnzahlBrueche());

        // Objekte erzeugen
        Bruch2 b1 = new Bruch2(4);
        Bruch2 b2 = new Bruch2(6, 7);
        // Nenner in b3 bewusst auf 0 gesetzt
        Bruch2 b3 = new Bruch2(2, 0);
        Bruch2 b4 = new Bruch2(3, 4);
        Bruch2 b5 = new Bruch2(3, 30);

        // Speicherorte ausgeben
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        System.out.println("\n\tAusgabe durch Methode ausgeben()");

        b1.ausgeben();
        b2.ausgeben();
        b3.ausgeben();
        b4.ausgeben();
        b5.ausgeben();

        // Methode ggT außerhalb der Klasse Bruch2 nutzen
        System.out.println("ggT von 68 und 153 ist " + b1.ggT(68, 153));

        b5.erweitern(5);
        b5.ausgeben();
        b5.kuerzen();
        b5.ausgeben();

        System.out.println("Ende - Anzahl Brüche: " + Bruch2.getAnzahlBrueche());
    }
}
