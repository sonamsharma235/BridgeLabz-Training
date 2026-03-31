package EncapsulationAbstraction;

class NonVegItem extends FoodItem {

    private static final double EXTRA_CHARGE = 50;

     public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }
}
