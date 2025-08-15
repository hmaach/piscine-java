// package StarGalaxy;

import java.util.Objects;

public class Star extends CelestialObject {

    private double magnitude;

    public Star() {
        super();
        this.magnitude = 0.;
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.x, this.y, this.z, this.magnitude);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Star other = (Star) obj;
        return this.name.equals(other.getName())
                && this.x == other.getX()
                && this.y == other.getY()
                && this.z == other.getZ()
                && this.magnitude == other.getMagnitude();
    }
}
