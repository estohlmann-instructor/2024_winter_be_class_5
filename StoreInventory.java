import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreInventory {
    private Map<Product, Integer> inventory = new HashMap<>();
    public void addProduct(Product product, Integer quantity) {
            if (inventory.containsKey(product)) {
                inventory.put(product, inventory.get(product) + quantity);
            } else {
                inventory.put(product, quantity);
            }
        }

    public void removeProduct(Product product, Integer quantity){
            if(inventory.containsKey(product)){
                if(inventory.get(product) - quantity > 0){
                    inventory.put(product, inventory.get(product) - quantity);
                } else {
                    inventory.remove(product);
                }
            }
        }

    public void printInventory() {
            for (Product product : inventory.keySet()) {
                System.out.println("We have " + inventory.get(product) + " "+ product.getProductName() + "'s");
            }
        }

    public void printTotalInventoryValue(){
        double value = 0;
        for(Product product : inventory.keySet()){
            value += (inventory.get(product)* product.getPrice());
        }
        System.out.printf("The total value of our inventory is $%.2f", value);
    }


}
