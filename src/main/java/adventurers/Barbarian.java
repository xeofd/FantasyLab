package adventurers;

import interfaces.IAttack;
import interfaces.ITakeDamage;
import tools.Weapon;

public class Barbarian extends Adventurer implements IAttack {
    private Weapon weapon;

    public Barbarian(int hp, String name) {
        super(hp, name);
        this.weapon = new Weapon(15,"Polearm");
    }

    public void takeDamage(int amount){
        setHp(getHp() - (amount));
    }
    public void attackOne(ITakeDamage target){

    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
