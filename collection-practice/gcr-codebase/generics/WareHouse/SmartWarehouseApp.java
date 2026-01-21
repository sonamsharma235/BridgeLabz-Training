package WareHouse;

public class SmartWarehouseApp {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 2));
        electronicsStorage.addItem(new Electronics("Mobile", 1));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", "10-02-2026"));
        groceriesStorage.addItem(new Groceries("Rice", "20-12-2026"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("---- Electronics ----");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n---- Groceries ----");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\n---- Furniture ----");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}

