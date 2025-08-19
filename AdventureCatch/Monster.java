// package Adventure;

public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        String res;
        if (this.getCurrentHealth() == 0) {
            res = String.format("%s is a monster and is dead.", this.getName());
        } else {
            res = String.format("%s is a monster with %d HP.", this.getName(), this.getCurrentHealth());
        }

        return res + " He has the weapon " + this.getWeapon().toString() + ".";
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int damage = (this.getWeapon() != null)
                ? this.getWeapon().getDamage()
                : 7;
        character.takeDamage(damage);
    }

    @Override
    public void takeDamage(int amount) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int effectiveDamage = (int) Math.floor(amount * 0.8);

        if (effectiveDamage >= this.getCurrentHealth()) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - effectiveDamage);
        }
    }

}
