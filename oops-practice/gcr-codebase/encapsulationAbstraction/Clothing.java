package EncapsulationAbstraction;

class Clothing extends Product implements Texable{
	public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST @12%";
    }
}
