
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

    // Groups strings by the uppercase first letter
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        return s.collect(Collectors.groupingBy(str -> (Character) Character.toUpperCase(str.charAt(0))));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        return s.collect(Collectors.groupingBy(
                i -> i % 4,
                Collectors.maxBy(Comparator.naturalOrder())
        ));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        String res = s.sorted().collect(Collectors.joining(" # "));
        return "{" + res + "}";
    }

}
