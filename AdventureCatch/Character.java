// package Adventure;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private static List<Character> allCharacters = new ArrayList<>();

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
        Character.allCharacters.add(this);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    protected void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public static String printStatus() {
        StringBuilder status = new StringBuilder();

        status.append("------------------------------------------\n");

        if (allCharacters.isEmpty()) {
            status.append("Nobody's fighting right now !\n");
        } else {
            status.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                status.append(String.format(" - %s\n", character.toString()));
            }
        }

        status.append("------------------------------------------\n");

        return status.toString();
    }

    public static Character fight(Character ch1, Character ch2) {
        Character winner = null;

        while (ch1.currentHealth != 0 && ch2.currentHealth != 0) {
            try {
                ch1.attack(ch2);
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
            }
            if (ch2.currentHealth == 0) {
                winner = ch1;
                break;
            }

            try {
                ch2.attack(ch1);
            } catch (DeadCharacterException e) {
                System.out.println(e.getMessage());
            }
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

    public abstract void takeDamage(int amount) throws DeadCharacterException;

    public abstract void attack(Character character) throws DeadCharacterException;
}
