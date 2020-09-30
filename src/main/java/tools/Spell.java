package tools;

public class Spell {

    // Attribute
    private int baseDamage;
    private String name;

    // Constructor
    public Spell(int baseDamage, String name) {
        this.baseDamage = baseDamage;
        this.name = name;
    }

    // Methods

    public String getName() {
        return this.name;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

}
