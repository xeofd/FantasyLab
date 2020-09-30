package monster;

public class MythicalCreature extends Creature {

    // Attributes
    private String name;

    // Constructor
    public MythicalCreature(int hp, String type, String name) {
        super(hp, type);

        this.name = name;
    }

    // Methods

    public String getName() {
        return name;
    }


}
