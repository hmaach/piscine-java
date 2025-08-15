// package StarGalaxy;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObjects) {
        this.celestialObjects.add(celestialObjects);
    }
}
