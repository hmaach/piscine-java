// package AdventureSorcerer;

// import Adventure.Healer;
// import Adventure.Character;

public class Sorcerer extends Character implements Healer {

    private int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity);
        } else {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.healCapacity);
        }
    }

    @Override
    public void heal(Character character) {
        this.currentHealth += this.healCapacity;
        if (this.currentHealth > this.getMaxHealth()) {
            this.currentHealth = this.getMaxHealth();
        }
    }

}
