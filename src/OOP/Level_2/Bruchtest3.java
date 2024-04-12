package OOP.Level_2;

public class Bruchtest3 {

    public static void main(String[] args) {

    Bruch3 b1 = new Bruch3(1, 2);
    Bruch3 b2 = new Bruch3(2, 3);
    Bruch3 b3 = new Bruch3(3, 4);

    // toString() aus Bruch3.java Zeile 84-87 wird hier genutzt, um b1 als String auszugeben
    System.out.println("b1 Test" + b1);

    Bruch3 ergebnis1 = b1.addiere(b2);
    System.out.println("Ergebnis der Addition von " + b1.getZaehler() + " / " + b1.getNenner() + " und " + b2.getZaehler() + " / " + b2.getNenner());
    System.out.println(ergebnis1.getZaehler() + " / " + ergebnis1.getNenner());

    Bruch3 ergebnis2 = b2.subtrahiere(b1);
    System.out.println("Ergebnis der Subtraktion von " + b2.getZaehler() + " / " + b2.getNenner() + " und " + b1.getZaehler() + " / " + b1.getNenner());
    System.out.println(ergebnis2.getZaehler() + " / " + ergebnis2.getNenner());

    Bruch3 ergebnis3 = b2.multipliziere(b3);
    System.out.println("Ergebnis der Multiplikation von " + b2.getZaehler() + " / " + b2.getNenner() + " und " + b3.getZaehler() + " / " + b3.getNenner());
    System.out.println(ergebnis3.getZaehler() + " / " + ergebnis3.getNenner());

    Bruch3 ergebnis4 = b3.dividiere(b1);
    System.out.println("Ergebnis der Division von " + b3.getZaehler() + " / " + b3.getNenner() + " und " + b1.getZaehler() + " / " + b1.getNenner());
    System.out.println(ergebnis4.getZaehler() + " / " + ergebnis4.getNenner());

    }
}
