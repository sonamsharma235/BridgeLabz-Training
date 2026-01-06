package EncapsulationAbstraction;

abstract class Product {
	private int productId;
	private String name;
	private double price;
	Product(int productId,String name,double price){
		this.name=name;
		this.price=price;
		this.productId=productId;
	}
	public String getName() {
		return name;
	}
	public int getProductId() {
		return productId;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}
	}
	public double calculateTax() {
	    return 0;
	}

	 abstract double calculateDiscount();

}
