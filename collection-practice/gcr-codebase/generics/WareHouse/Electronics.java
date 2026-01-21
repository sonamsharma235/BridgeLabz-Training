package WareHouse;

class Electronics extends WarehouseItem {
    private int warrantyYears;

    public Electronics(String name, int warrantyYears) {
        super(name);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + ", Warranty: " + warrantyYears + " years";
    }
}

