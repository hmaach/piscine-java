
import java.util.Arrays;

public class ComputeArray {

    public static int[] computeArray(int[] array) {
        System.out.println("Input array: " + Arrays.toString(array));
        int[] new_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int nb = array[i];
            if (nb % 3 == 0) {
                new_array[i] = nb * 5;
            } else {
                if ((nb % 3) % 2 == 0) {
                    new_array[i] = nb;
                } else if ((nb % 3) % 1 == 0) {
                    new_array[i] = nb + 7;
                }
            }
        }

        return new_array;
    }
}
