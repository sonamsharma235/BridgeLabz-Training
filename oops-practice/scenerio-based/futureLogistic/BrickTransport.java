public class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public float getBrickSize() {
        return brickSize;
    }

    public void setBrickSize(float brickSize) {
        this.brickSize = brickSize;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public void setBrickQuantity(int brickQuantity) {
        this.brickQuantity = brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    public void setBrickPrice(float brickPrice) {
        this.brickPrice = brickPrice;
    }

    @Override
    public String vehicleSelection() {

        if (brickQuantity < 300)
            return "Truck";
        else if (brickQuantity <= 500)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {

        float price = brickPrice * brickQuantity;

        float tax = price * 0.3f;

        float discountPercentage = 0;

        if (transportRating == 5)
            discountPercentage = 20;
        else if (transportRating == 3 || transportRating == 4)
            discountPercentage = 10;

        float discount = price * discountPercentage / 100;

        float vehiclePrice = 0;

        String vehicle = vehicleSelection().toLowerCase();

        if (vehicle.equalsIgnoreCase("truck"))
            vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("lorry"))
            vehiclePrice = 1700;
        else if (vehicle.equalsIgnoreCase("monsterlorry"))
            vehiclePrice = 3000;

        return (price + vehiclePrice + tax) - discount;
    }
}
