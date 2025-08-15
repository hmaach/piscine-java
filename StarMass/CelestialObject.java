// package StarMass;

import java.util.Objects;

public class CelestialObject {

    protected double x;
    protected double y;
    protected double z;
    protected String name;
    private int mass;

    public static double KM_IN_ONE_AU = 150_000_000.;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z, int mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = mass;
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

    public int getMass() {
        // System.out.print(this.mass);
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CelestialObject other = (CelestialObject) obj;
        return this.x == other.getX() && this.y == other.getY() && this.z == other.getZ() && this.name.equals(other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.x, this.y, this.z);
    }
}
