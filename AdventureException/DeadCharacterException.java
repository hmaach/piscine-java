
public class DeadCharacterException extends Exception {

    private final Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    @Override
    public String getMessage() {
        String type = character.getClass().getSimpleName().toLowerCase();

        return String.format("The %s %s is dead.", type, character.getName());
    }
}
