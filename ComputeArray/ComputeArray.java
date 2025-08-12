
public class ComputeArray {

    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        int[] new_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int nb = array[i];
            int mod = nb % 3;

            switch (mod) {
                case 0 ->
                    new_array[i] = nb * 5;
                case 1 ->
                    new_array[i] = nb + 7;
                default ->
                    new_array[i] = nb;
            }
        }
        return new_array;
    }
}
