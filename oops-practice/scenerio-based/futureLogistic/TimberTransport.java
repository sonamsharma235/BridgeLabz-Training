public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {

        super(transportId, transportDate, transportRating);

        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }

    public void setTimberLength(float timberLength) {
        this.timberLength = timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public void setTimberRadius(float timberRadius) {
        this.timberRadius = timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public void setTimberType(String timberType) {
        this.timberType = timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    public void setTimberPrice(float timberPrice) {
        this.timberPrice = timberPrice;
    }

    @Override
    public String vehicleSelection() {

        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {

        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float rate = 0;

        if (timberType.equalsIgnoreCase("Premium"))
            rate = 0.25f;
        else
            rate = 0.15f;

        float price = volume * timberPrice * rate;

        float tax = price * 0.3f;

        float discountPercentage = 0;

        if (transportRating == 5)
            discountPercentage = 20;
        else if (transportRating == 3 || transportRating == 4)
            discountPercentage = 10;

        float discount = price * discountPercentage / 100;

        float vehiclePrice = 0;

        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("truck"))
            vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("lorry"))
            vehiclePrice = 1700;
        else if (vehicle.equalsIgnoreCase("monsterlorry"))
            vehiclePrice = 3000;

        return (price + vehiclePrice + tax) - discount;
    }
}
