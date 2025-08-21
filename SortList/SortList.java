
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
