// package StarPlanet;

import java.util.Objects;

public class Planet extends CelestialObject {

    private Star centerStar;

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU",
                this.name,
                this.centerStar.name,
                CelestialObject.getDistanceBetween(this, this.centerStar)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.x, this.y, this.z, this.centerStar);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Planet other = (Planet) obj;
        return this.name.equals(other.getName())
                && this.x == other.getX()
                && this.y == other.getY()
                && this.z == other.getZ()
                && this.centerStar.equals(other.getCenterStar());
    }

}
