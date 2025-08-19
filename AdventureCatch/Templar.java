
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {

        String res;
        if (this.getCurrentHealth() == 0) {
            res = String.format(
                    "%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                    this.getName(),
                    this.shield,
                    this.healCapacity
            );
        } else {
            res = String.format(
                    "%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    this.getName(),
                    this.getCurrentHealth(),
                    this.healCapacity,
                    this.shield
            );
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
                : 6;

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
            this.setCurrentHealth(this.getCurrentHealth() - (amount - this.shield));
        }
    }
}
