
import java.util.Map;

public class MapEquals {

    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {

        if ((map1 == null && map2 != null) || (map1 != null && map2 == null)) {
            return false;
        }
        if (map1 == null && map2 == null) {
            return true;
        }

        if (map1.size() != map2.size()) {
            return false;
        }

        for (Map.Entry<String, Integer> m : map1.entrySet()) {
            String key = m.getKey();
            Integer value = m.getValue();

            Integer toCompare = map2.get(key);
            if (!value.equals(toCompare)) {
                return false;
            }
        }

        return true;
    }
}
