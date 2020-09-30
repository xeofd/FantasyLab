import adventurers.Dwarf;
import monster.Monster;
import org.junit.Before;
import org.junit.Test;
import tools.Weapon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DwarfTest {

    // Set up
    private Dwarf dwarf;
    private Monster monster;
    private Weapon sword;

    @Before
    public void before() {
        dwarf = new Dwarf(10, "Ben");
        monster = new Monster(4, "Troll");
        sword = new Weapon(4, "Sword");
    }

    // Tests

    @Test // Test 1: Get name
    public void getName(){
        assertEquals("Ben", dwarf.getName());
    }

    @Test // Test 2: Get hp
    public void getHp() {
        assertEquals(10, dwarf.getHp());
    }

    @Test // Test 3: Can heal
    public void canHeal() {
        dwarf.heal(1);

        assertEquals(11, dwarf.getHp());
    }

    @Test // Test 4: Can take damage
    public void canTakeDamage() {
        dwarf.takeDamage(2);

        assertEquals(8, dwarf.getHp());
    }

    @Test // Test 5: Can attack
    public void canAttack() {
        dwarf.attackOne(monster);

        assertEquals(1, monster.getHp());
    }

    @Test // Test 6: Can change weapon
    public void canChangeWeapon() {
        dwarf.changeWeapon(sword);
        dwarf.attackOne(monster);

        assertEquals(0, monster.getHp());
    }

    @Test // Test 7: Can check if alive
    public void canCheckIsAlive() {
        assertEquals(true, dwarf.isAlive());
    }
}
