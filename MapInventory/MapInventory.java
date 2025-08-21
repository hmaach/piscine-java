
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {

    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        return inventory.getOrDefault(productId, -1);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> en : inventory.entrySet()) {
            String elem = en.getKey();
            Integer elemPrice = en.getValue();
            if (elemPrice == price) {
                list.add(elem);
            }
        }

        return list;
    }
}
