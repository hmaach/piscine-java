
import java.util.stream.Stream;

public class StreamReduce {

    public static Integer sumAll(Stream<Integer> s) {
        return s.reduce((a, b) -> a + b).orElse(0);
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        // return s.mapToInt(nb -> nb / divider).sum();
        return s.map(nb -> nb / divider).reduce(0, (sum, val) -> sum + val);
    }
}
