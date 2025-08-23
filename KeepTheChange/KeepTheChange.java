
import java.util.*;

public class KeepTheChange {

    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        int[] dynTable = new int[amount + 1];
        int[] last = new int[amount + 1];
        Arrays.fill(dynTable, Integer.MAX_VALUE);
        dynTable[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i && dynTable[i - c] < Integer.MAX_VALUE && dynTable[i - c] + 1 < dynTable[i]) {
                    dynTable[i] = dynTable[i - c] + 1;
                    last[i] = c;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = amount; i > 0; i -= last[i]) {
            result.add(last[i]);
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
