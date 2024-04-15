package OOP.Vererbung;

public class Huhn extends Tier {
    public Huhn(String name, int gebJahr) {
        super(name, gebJahr);
    }

    @Override
    public void gibLaut() {
        System.out.println(this.getName() + " macht Kikerikiii!");
    }

    public void legtEi() {
        System.out.println(this.getName() + " hat ein Ei gelegt.");
    }
}
