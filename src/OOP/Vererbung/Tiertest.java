package OOP.Vererbung;

public class Tiertest {
    public static void main(String[] args) {
        Hund lee = new Hund("Lee", 2009);
        Katze schimi = new Katze("Schimanski", 1996);
        Huhn henrietta = new Huhn("Henrietta", 2020);

        Tier[] gehege = {lee, schimi, henrietta};

//        for (int i = 0; i < gehege.length; i++) {
//               System.out.println(gehege[i].getName() + " wurde im Jahr " + gehege[i].getGebJahr() + " geboren.");
//               gehege[i].gibLaut();
//
//         Casting class Hund on i'th element of gehege
//            if (gehege[i] instanceof Hund) ((Hund)gehege[i]).apportieren("Ball");
//            if (gehege[i] instanceof Katze) ((Katze)gehege[i]).schnurren();
//            if (gehege[i] instanceof Huhn) ((Huhn)gehege[i]).legtEi();
//            System.out.println("----------------");
//        }

        // enhanced loop / foreach loop
        for (Tier tier : gehege) {
            System.out.println(tier.getName() + " wurde im Jahr " + tier.getGebJahr() + " geboren.");
            tier.gibLaut();
            if (tier instanceof Hund) {
                // casting class Hund on tier
                // so if tier is Hund -> tier apportieren, else do nothing
                ((Hund)tier).apportieren("Ball");
            }
            if (tier instanceof Katze) ((Katze)tier).schnurren();
            if (tier instanceof Huhn) ((Huhn)tier).legtEi();
            System.out.println("----------------");
        }

        System.out.println("Anzahl Tiere im Gehege: " + Tier.getAnzahlTiere());
//        lee.gibLaut();
//        schimi.gibLaut();
//        henrietta.gibLaut();

//        lee.aportieren("Stoffknochen");
//        schimi.schnurren();

    }
}
