package tools;

public class Consumable {

    // Attributes
    private String name;
    private int baseHealing;

    // Constructor

    public Consumable(String name, int baseHealing) {
        this.name = name;
        this.baseHealing = baseHealing;
    }

    // Methods

    public int getBaseHealing() {
        return this.baseHealing;
    }

    public String getName() {
        return this.name;
    }

}
