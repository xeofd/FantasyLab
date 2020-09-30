package adventurers;

import interfaces.IAttack;
import interfaces.ITakeDamage;
import tools.Weapon;

import java.util.ArrayList;

public class Dwarf extends Adventurer implements IAttack {

    // Attributes

    private Weapon weapon;

    // Constructor
    public Dwarf(int hp, String name) {
        super(hp, name);

        this.weapon = new Weapon(3, "Axe");
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

    public int tryDodge() {
        int mitigated = 0;
        int random = (int)(Math.random()*10) + 1;
        if (random > 5) {
            mitigated = 4;
        }

        return mitigated;
    }

}
