
import java.util.Set;

public class SetEquals {

    public static boolean areSetsEqual(Set<String> set1, Set<String> set2) {
        if (set1 == null || set2 == null) {
            return set1 == set2;
        }
        if (set1.size() != set2.size()) {
            return false;
        }

        for (String elem : set1) {
            if (!set2.contains(elem)) {
                return false;
            }
        }
        return true;
    }
}
