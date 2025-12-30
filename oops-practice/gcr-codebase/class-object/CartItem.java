class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }
    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        }
    }
    void showTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost: $" + total);
    }

    public static void main(String[] args) {
       // 1st object
        CartItem item = new CartItem();
        item.itemName = "Laptop";
        item.price = 999.99;
        item.quantity = 1;

        item.addItem(2);
        item.removeItem(1);
        item.showTotalCost();
    }
}
