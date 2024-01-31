public class Main {
    public static void main(String... args){
        StoreInventory inventory = new StoreInventory();

        Product laptop = new Product(1, "Laptop", 299.99);
        inventory.addProduct(laptop, 3);
        inventory.addProduct(new Product(2, "Speakers", 25.15), 10);
        inventory.addProduct(new Product(3, "Keyboard", 115.35), 1);
        inventory.addProduct(laptop, 2);

        inventory.printInventory();
        System.out.println();

        inventory.removeProduct(laptop, 2);
        inventory.printInventory();
        System.out.println();
        inventory.printTotalInventoryValue();
    }
}
