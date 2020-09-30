package adventurers;

import interfaces.IAttack;
import interfaces.ITakeDamage;
import tools.Weapon;

public class Knight extends Adventurer implements IAttack {

    // Attribute
    private Weapon weapon;

    // Constructor

    public Knight(int hp, String name) {
        super(hp, name);

        this.weapon = new Weapon(8, "Sword");
    }

    // Methods

    public void attackOne(ITakeDamage target) {
        target.takeDamage(this.weapon.getBaseDmg());
    }

    public void takeDamage(int amount) {
        setHp(getHp() - amount);
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void pray() {
        this.weapon.setBaseDmg(2);
        this.heal(4);
    }

    public int tryDodge() {
        int mitigated = 0;
        int random = (int)(Math.random()*10) + 1;
        if (random > 5) {
            mitigated = 4;
        }

        return mitigated;
    }
}
