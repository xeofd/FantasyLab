package monster;

import interfaces.ITakeDamage;

public abstract class Creature implements ITakeDamage {

    // Attributes
    private int hp;
    private String type;

    // Constructor
    public Creature(int hp, String type) {
        this.hp = hp;
        this.type = type;
    }

    // Methods

    public void takeDamage(int amount) {
        this.hp -= amount;
    }

    public int getHp() {
        return this.hp;
    }

    public String getType() {
        return this.type;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

}
