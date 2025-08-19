// package AdventureSorcerer;

// import Adventure.Healer;
// import Adventure.Character;
public class Sorcerer extends Character implements Healer {

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public String toString() {
        String res;
        if (this.getCurrentHealth() == 0) {
            res = String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity);
        } else {
            res = String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), this.healCapacity);
        }
        return res + " He has the weapon " + this.getWeapon().toString() + ".";
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int newHealth = character.getCurrentHealth() + this.healCapacity;

        if (newHealth > character.getMaxHealth()) {
            newHealth = character.getMaxHealth();
        }

        character.setCurrentHealth(newHealth);
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        this.heal(this);
        int damage = (this.getWeapon() != null)
                ? this.getWeapon().getDamage()
                : 10;
        character.takeDamage(damage);
    }

    @Override
    public void takeDamage(int amount) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (amount >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - amount);
        }
    }
}
