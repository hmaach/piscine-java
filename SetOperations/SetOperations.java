
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();

        for (Integer int1 : set1) {
            res.add(int1);
        }
        for (Integer int2 : set2) {
            res.add(int2);
        }
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();

        for (Integer int1 : set1) {
            if (set2.contains(int1)) {
                res.add(int1);
            }
        }
        return res;
    }
}
