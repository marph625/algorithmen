package Schaltjahr;

import javax.swing.JOptionPane;
import Schaltjahr.Schaltjahr_v2;

public class Schaltjahr {
    public static void main(String[] args) {
        // Eingabe
        var eingabe = JOptionPane.showInputDialog("Wie überprüfen mal wieder, ob ein Jahr ein Schaltjahr.Schaltjahr ist -> ");
        var jahr = Integer.parseInt(eingabe);

        // Verarbeitung und Ausgabe
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    JOptionPane.showMessageDialog(null, "Treffer!");
                } else {
                    JOptionPane.showMessageDialog(null, "Kein Schaltjahr.Schaltjahr!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Treffer!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kein Schaltjahr.Schaltjahr!");
        }
    }
}
