// package AdventureUtils;

import java.util.ArrayList;

public class Character {

    private static ArrayList<Character> allCharacters = new ArrayList<>();

    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        Character.allCharacters.add(this);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public static String printStatus() {
        StringBuilder status = new StringBuilder();

        status.append("------------------------------------------\n");
        if (Character.allCharacters.isEmpty()) {
            status.append("Nobody's fighting right now !\n");
        } else {
            status.append("Characters currently fighting : \n");

            for (Character character : Character.allCharacters) {
                status.append(String.format(" - %s%n", character.toString()));
            }
        }

        status.append("------------------------------------------");

        return status.toString();
    }

    public static Character fight(Character ch1, Character ch2) {
        Character winner = null;

        while (ch1.currentHealth != 0 && ch2.currentHealth != 0) {
            ch1.attack(ch2);
            if (ch2.currentHealth == 0) {
                winner = ch1;
                break;
            }

            ch2.attack(ch1);
            if (ch1.currentHealth == 0) {
                winner = ch2;
                break;
            }
        }

        return winner;
    }

    @Override
    public String toString() {
        if (this.currentHealth > 0) {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        } else {
            return String.format("%s : KO", this.name);
        }
    }

    public void takeDamage(int amount) {
        if (amount >= this.currentHealth) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= amount;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }
}
