// package StarStatic;

public class CelestialObject {

    private double x;
    private double y;
    private double z;
    private String name;

    public static double KM_IN_ONE_AU = 150_000_000.;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject defaultStar, CelestialObject earth) {

        double dx = defaultStar.getX() - earth.getX();
        double dy = defaultStar.getY() - earth.getY();
        double dz = defaultStar.getZ() - earth.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar, CelestialObject earth) {
        return CelestialObject.getDistanceBetween(defaultStar, earth) * CelestialObject.KM_IN_ONE_AU;
    }

}
