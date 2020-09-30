package tools;

public class Weapon {

    // Attributes
    private int baseDmg;
    private String type;

    // Constructor
    public Weapon(int baseDmg, String type) {
        this.baseDmg = baseDmg;
        this.type = type;
    }

    // Methods

    public int getBaseDmg() {
        return this.baseDmg;
    }

    public String getType() {
        return this.type;
    }

    public void setBaseDmg(int increase) {
        this.baseDmg += increase;
    }
}
