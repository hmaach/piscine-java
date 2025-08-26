
public class Excalibur {

    private final String name;
    private final static Excalibur excalibur = new Excalibur("Sword");

    private Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Excalibur getInstance() {
        return excalibur;
    }
}
