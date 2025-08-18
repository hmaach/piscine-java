// package Adventure;

public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format("%s is a monster and is dead", this.getName());
        } else {
            return String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
        }
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public void takeDamage(int amount) {
        int effectiveDamage = (int) Math.floor(amount * 0.8);

        if (effectiveDamage >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - effectiveDamage);
        }
    }

}
