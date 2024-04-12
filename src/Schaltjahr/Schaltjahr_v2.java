package Schaltjahr;
import Schaltjahr.Schaltjahr.*;

import javax.swing.*;

public class Schaltjahr_v2 {
    static boolean berechnung_v2(int jahr) {
        return (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0);
    }

}