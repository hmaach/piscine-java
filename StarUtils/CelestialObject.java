// package StarUtils;

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

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }

    @Override
    public boolean equals(Object obj) {
        return this.x == ((CelestialObject) obj).getX() && this.y == ((CelestialObject) obj).getY() && this.z == ((CelestialObject) obj).getZ();
    }

    @Override
    public int hashCode() {
        int result = 1000;
        result *= (int) this.x;
        result *= (int) this.y;
        result *= (int) this.z;
        return result;
    }
}
