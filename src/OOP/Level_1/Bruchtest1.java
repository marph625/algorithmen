package OOP.Level_1;

public class Bruchtest1 {
    public static void main(String[] args) {

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

        b1.ausgeben();
        b2.ausgeben();
        b3.ausgeben();
        b4.ausgeben();
        b5.ausgeben();
        b5.gekuerztAusgeben();

    }
}
