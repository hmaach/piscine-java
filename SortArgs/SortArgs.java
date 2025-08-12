
import java.util.Arrays;

public class SortArgs {

    public static void sort(String[] args) {
        Arrays.sort(args);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            int nb = Integer.parseInt(args[i]);
            res.append(nb);
            if (i < args.length - 1) {
                res.append(' ');
            }
        }
        System.out.println(res);
    }
}
