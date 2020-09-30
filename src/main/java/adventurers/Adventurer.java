package adventurers;

import interfaces.ITakeDamage;

public abstract class Adventurer implements ITakeDamage{

    // Attributes
    int hp;
    private String name;

    // Constructor
    public Adventurer(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    // Methods

    // Getters
    public int getHp() {
        return this.hp;
    }

    public void setHp(int amount) {
        this.hp = amount;
    }

    public String getName() {
        return this.name;
    }

    public void heal(int health) {
        this.hp += health;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
    }

}
