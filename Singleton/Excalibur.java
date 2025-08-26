
public class Excalibur {

    private final String name;
    private final static Excalibur INSTANCE = new Excalibur("Sword");

    private Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Excalibur getInstance() {
        return INSTANCE;
    }
}
