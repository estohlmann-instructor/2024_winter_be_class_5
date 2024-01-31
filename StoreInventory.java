import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreInventory {
    private Map<Product, Integer> inventory = new HashMap<>();
        private void addProduct(Product product, Integer quantity) {
            if (inventory.containsKey(product)) {
                inventory.put(product, inventory.get(product) + quantity);
            } else {
                inventory.put(product, quantity);
            }
        }

        private void printInventory() {
            for (Product product : inventory.keySet()) {
                System.out.println("We have " + inventory.get(product) + product + "'s");
            }
        }


}
