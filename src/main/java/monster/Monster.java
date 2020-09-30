package monster;

import interfaces.IAttack;
import interfaces.ITakeDamage;

public class Monster extends Creature implements IAttack {

    // Constructor

    public Monster(int hp, String type) {
        super(hp, type);
    }

    //
    public void attackOne(ITakeDamage target) {
        target.takeDamage(5);
    }

}
