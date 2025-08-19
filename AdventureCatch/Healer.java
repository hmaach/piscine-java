// package Adventure;

public interface Healer {

    public void heal(Character character) throws DeadCharacterException;

    public int getHealCapacity();
}
