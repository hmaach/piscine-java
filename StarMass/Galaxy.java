// package StarMass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Integer> computeMassRepartition() {

        Map<String, Integer> hashmap = new HashMap<>();

        for (CelestialObject obj : this.celestialObjects) {
            String type;

            if (obj instanceof Star) {
                type = "Star";
                hashmap.getOrDefault("Star", 0);
            } else if (obj instanceof Planet) {
                type = "Planet";
                hashmap.getOrDefault("Planet", 0);
            } else {
                type = "Other";
                hashmap.getOrDefault("Other", 0);
            }

            int currentMass = hashmap.getOrDefault(type, 0);
            hashmap.put(type, currentMass + (int) obj.getMass());
        }

        return hashmap;
    }
}
