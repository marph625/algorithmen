package OOP.Vererbung;

public class Katze extends Tier {
    public Katze(String name, int gebJahr) {
        super(name, gebJahr);
    }

    @Override
    public void gibLaut() {
        System.out.println(this.getName() + " macht Miau!");
    }
    public void schnurren() {
        System.out.println(this.getName() + " schnurrt...");
    }
}
