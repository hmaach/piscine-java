
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wedding {

    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> couples = new HashMap<>();

        List<String> biggerList;
        List<String> smallerList;

        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);

        if (first.size() > second.size()) {
            biggerList = firstList;
            smallerList = secondList;
        } else {
            biggerList = secondList;
            smallerList = firstList;
        }

        for (int i = 0; i < smallerList.size(); i++) {
            String firstSingle = biggerList.get(i);
            String secondSingle = smallerList.get(i);

            couples.put(firstSingle, secondSingle);
        }

        return couples;
    }
}
