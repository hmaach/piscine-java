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

        hashmap.put("Star", 0);
        hashmap.put("Planet", 0);
        hashmap.put("Other", 0);

        for (CelestialObject obj : this.celestialObjects) {
            String type;

            if (obj instanceof Star) {
                type = "Star";
            } else if (obj instanceof Planet) {
                type = "Planet";
            } else {
                type = "Other";
            }

            int currentMass = hashmap.get(type);
            hashmap.put(type, currentMass + (int) obj.getMass());
        }

        return hashmap;
    }
}
