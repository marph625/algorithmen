package Arrays;

import java.util.ArrayList;
import OOP.Level_2.Bruch3;

public class ArrayList_Test {
    public static void main(String[] args) {
        ArrayList <String> liste = new ArrayList<String>(4);

        liste.add("Bisasam");
        liste.add("Glumanda");
        liste.add("Schiggy");

        // set überschreibt den jeweiligen Wert
        // add würde "Glutexo" zwischen "Glumanda" und "Schiggy" platzieren
        liste.set(2, "Glutexo");

        // .size() ruft anstelle von length die Länge bzw. Größe der ArrayList
        for (int i = 0; i < liste.size(); i++) {
            // .get(i) anstelle von liste[i]
            System.out.println(liste.get(i));
        }

        System.out.println("Liste wird geleert...");
        liste.clear();
        System.out.println(liste);

        Bruch3 b1 = new Bruch3(1, 4);

        ArrayList<Bruch3> teile = new ArrayList<Bruch3>();
        teile.add(b1);
        teile.add(new Bruch3(1, 4));
        teile.add(new Bruch3(1, 4));

        Bruch3 summe = new Bruch3();

        for (int i = 0; i < teile.size(); i++) {
            summe = summe.addiere(teile.get(i));
            System.out.println("Bruch " + (i+1) + " = " + teile.get(i));
        }

        System.out.println("Die Summe aller Brüche beträgt: " + summe);
    }
}
