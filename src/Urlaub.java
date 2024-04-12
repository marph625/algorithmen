import javax.swing.JOptionPane;

public class Urlaub {
    public static void main(String[] args) {

        // Eingabe
        var eingabe = JOptionPane.showInputDialog("Wie alt bist du?");
        var alter = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog("Gib den Grad der Behinderung in % an");
        var behinderungsgrad = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog("Wie viele Jahre bist du bei uns angestellt?");
        var betriebsangehoerigkeit = Integer.parseInt(eingabe);

        // Standardwert für Urlaub
        var urlaub = 26;

        // Verarbeitung
        if (behinderungsgrad >= 50) {
            urlaub += 5;
        }
        if (alter < 18) {
            urlaub += 4;
        } else if (alter > 55) {
            urlaub += 2;
        }
        if (betriebsangehoerigkeit > 10) {
            urlaub += 2;
        }

        // Ausgabe
        JOptionPane.showMessageDialog(null, "Ihr Urlaubsanspruch beträgt " + urlaub + " Tage.");
    }
}
