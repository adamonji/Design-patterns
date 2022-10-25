package factory.units;

public class Unit {
    private int hp;
    private int exp;
    private int dmqDone;

    protected Unit(int hp, int exp, int dmqDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmqDone = dmqDone;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "hp=" + hp +
                ", exp=" + exp +
                ", dmqDone=" + dmqDone +
                '}';
    }
}
