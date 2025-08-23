
import java.util.*;
import java.util.stream.*;

public class StreamMap {

    public static Integer sumOfStringLength(Stream<String> s) {
        return s.mapToInt(String::length).sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(nb -> nb > 42).map(nb -> nb.intValue()).collect(Collectors.toSet());
    }
}
