import adventurers.Adventurer;
import monster.Monster;

import java.util.ArrayList;

public class Room {

    // Attributes
    private ArrayList<Adventurer> players;
    private Monster monster;
    private int treasure;

    // Constructor

    public Room(Monster monster, int treasure) {
        this.players = null;
        this.monster = monster;
        this.treasure = treasure;
    }

    // Methods

    public ArrayList<Adventurer> getPlayer() {
        return players;
    }

    public void addPlayer(Adventurer player) {
        this.players.add(player);
    }

    public void removePlayer(Adventurer player) {
        this.players.remove(player);
    }

    public Monster getMonster() {
        return monster;
    }

    public int getTreasure() {
        return treasure;
    }
}
