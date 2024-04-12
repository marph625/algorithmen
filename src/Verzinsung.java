import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Verzinsung {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Startkapital ein: ");
        var startkapital = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie Ihren Zinssatz ein: ");
        var zinssatz = Double.parseDouble(eingabe);
        int jahr = 0;
        double endkapital = startkapital;

        do {
            endkapital = endkapital * (1 + zinssatz / 100);
            jahr += 1;
            System.out.println(jahr + ": " + endkapital);
        } while (endkapital < (startkapital * 2));

        JOptionPane.showMessageDialog(null, "Ihr Endkapital betraegt nach " + jahr + " Jahren: " + endkapital + " €");
    }

}
