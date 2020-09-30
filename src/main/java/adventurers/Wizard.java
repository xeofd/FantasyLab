package adventurers;

import interfaces.ICast;
import interfaces.ITakeDamage;
import monster.MythicalCreature;
import tools.Spell;

import java.util.ArrayList;

public class Wizard extends Adventurer implements ICast {

    // Attributes
    private MythicalCreature pet;
    private ArrayList<Spell> spellBook;
    private Spell selectedSpell;

    // Constructor
    public Wizard(int hp, String name) {
        super(hp, name);
        this.pet = null;
        this.spellBook = new ArrayList<Spell>();
        this.selectedSpell = null;
    }

    // Methods

    public void selectSpell(int index) {
        this.selectedSpell = spellBook.get(index);
    }

    public void changePet(MythicalCreature pet) {
        this.pet = pet;
    }

    public void castSpell(ITakeDamage target) {
        target.takeDamage(this.selectedSpell.getBaseDamage());
    }

    public void learnSpell(Spell spell) {
        this.spellBook.add(spell);
    }
}
