import adventurers.Knight;
import monster.Monster;
import org.junit.Before;
import org.junit.Test;
import tools.Weapon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KnightTest {

    // Set up
    private Knight knight;
    private Monster monster;
    private Weapon axe;

    @Before
    public void before() {
        knight = new Knight(20, "Joe");
        monster = new Monster(34, "Zombie");
        axe = new Weapon(18, "Axe");
    }

    // Tests

    @Test // Test 1: Can attack
    public void canAttack() {
        knight.attackOne(monster);

        assertEquals(26, monster.getHp());
    }

    @Test // Test 2: Can take damage
    public void canTakeDamage() {
        knight.takeDamage(10);

        assertEquals(10, knight.getHp());
    }

    @Test // Test 3: Can change weapon
    public void canChangeWeapon() {
        knight.changeWeapon(axe);

        assertEquals(axe, knight.getWeapon());
    }

    @Test // Test 4: Can pray
    public void canPray() {
        knight.pray();

        assertEquals(10, knight.getWeapon().getBaseDmg());
    }
}
