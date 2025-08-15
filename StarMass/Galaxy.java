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

            hashmap.getOrDefault("Star", 0);
            hashmap.getOrDefault("Planet", 0);
            hashmap.getOrDefault("Other", 0);
            
            if (obj instanceof Star) {
                type = "Star";
            } else if (obj instanceof Planet) {
                type = "Planet";
            } else {
                type = "Other";
            }

            int currentMass = hashmap.getOrDefault(type, 0);
            hashmap.put(type, currentMass + (int) obj.getMass());
        }

        return hashmap;
    }
}
