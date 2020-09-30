import adventurers.Knight;
import jdk.nashorn.internal.codegen.ObjectClassGenerator;
import monster.Monster;
import tools.Weapon;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {

    public static void main(String[] args) {

        // Set up
        boolean gameState = true;
        String endGame = "";

        Knight knight = new Knight(10, "Sir Squiggly");
        Monster ogre = new Monster(25, "Ogre");
        Weapon axe = new Weapon(10, "Axe");
//        Room outside = new Room(null, 0);
        Room cave = new Room(ogre, 100);

        cave.addPlayer(knight);

        Scanner scanner = new Scanner(System.in);

        // Start

        System.out.println("Welcome to Fantasyland!");
        System.out.println("You are " + knight.getName());
        System.out.println("You are in a Cave, there is an " + cave.getMonster().getType() + " in the cave.");

        while(gameState && knight.isAlive()) {
            System.out.println("What do you do? ");
            System.out.println("1. Leave");
            System.out.println("2. Fight Ogre");

            String response = scanner.next();

            if (parseInt(response) == 1) {
                endGame = "You ran away!";
                gameState = false;
            } else if (parseInt(response) == 2) {

                if(cave.getMonster().isAlive()) {
                    System.out.println("What do you do? ");
                    System.out.println("1. Attack (Hit enemy for " + knight.getWeapon().getBaseDmg());
                    System.out.println("2. Pray (Heal for 4 and increase weapon damage by 2)");

                    response = scanner.next();

                    if (parseInt(response) == 1) {
                        knight.attackOne(cave.getMonster());
                    } else if (parseInt(response) == 2) {
                        knight.pray();
                    }

                    cave.getMonster().attackOne(knight);

                } else {
                    endGame = "Monster is dead! You have looted: " + cave.getTreasure() + " gold!";
                    gameState = false;
                }

            }
        }

        System.out.println(endGame);
        System.out.println("Game Over! Goodbye :)");

    }

}
