class ShoppingCart {

    static double discount = 10.0;

    final String productID;
    String productName;
    double price;
    int quantity;

    ShoppingCart(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    double getPriceAfterDiscount() {
        return price - (price * discount / 100);
    }

    void displayProduct(Object obj) {
        if (obj instanceof ShoppingCart) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: " + getPriceAfterDiscount());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ShoppingCart p1 = new ShoppingCart("P001", "Laptop", 1200.0, 5);
        ShoppingCart p2 = new ShoppingCart("P002", "Smartphone", 800.0, 10);

        p1.displayProduct(p1);
        p2.displayProduct(p2);
    }
}
