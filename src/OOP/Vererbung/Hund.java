package OOP.Vererbung;

public class Hund extends Tier {

    public Hund(String name, int gebJahr) {
        super(name, gebJahr);
    }

    @Override
    public void gibLaut() {
        System.out.println(this.getName() + " macht Wuff!");
    }

    public void apportieren(String gegenstand) {
        System.out.println(this.getName() + " apportiert " + gegenstand);
    }
}
