package adventurers;

import interfaces.ITakeDamage;
import tools.Consumable;

public class Cleric extends Adventurer {

    // Attributes
    private Consumable consumable;

    // Constructor

    public Cleric(int hp, String name) {
        super(hp, name);
        this.consumable = null;
    }

    // Methods

    public Consumable getConsumable() {
        return this.consumable;
    }

    public void healPlayer(Adventurer target) {
        target.heal(this.consumable.getBaseHealing());
    }

    public void changeConsumable(Consumable consumable) {
        this.consumable = consumable;
    }

}
