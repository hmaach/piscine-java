
import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {

    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        Integer idx = list.lastIndexOf(value);
        if (idx == -1) {
            return null;
        }
        return idx;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        Integer idx = list.indexOf(value);
        if (idx == -1) {
            return null;
        }
        return idx;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> indexes = new ArrayList<>();
        Integer idx = 0;
        
        if (list == null) {
            return indexes;
        }

        for (Integer elem : list) {
            if (elem.equals(value)) {
                indexes.add(idx);
            }
            idx++;
        }
        return indexes;
    }
}
