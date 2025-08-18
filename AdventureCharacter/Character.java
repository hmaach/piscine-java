// package AdventureCharacter;

public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
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
