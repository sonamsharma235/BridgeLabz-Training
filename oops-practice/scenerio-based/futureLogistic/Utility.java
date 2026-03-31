public class Utility {

    public GoodsTransport parseDetails(String input) {

        String arr[] = input.split(":");

        String transportId = arr[0];
        String date = arr[1];
        int rating = Integer.parseInt(arr[2]);
        String type = arr[3];

        if (type.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(arr[4]);
            int brickQuantity = Integer.parseInt(arr[5]);
            float brickPrice = Float.parseFloat(arr[6]);

            return new BrickTransport(transportId, date, rating,
                    brickSize, brickQuantity, brickPrice);

        } else {

            float timberLength = Float.parseFloat(arr[4]);
            float timberRadius = Float.parseFloat(arr[5]);
            String timberType = arr[6];
            float timberPrice = Float.parseFloat(arr[7]);

            return new TimberTransport(transportId, date, rating,
                    timberLength, timberRadius, timberType, timberPrice);
        }
    }

    public boolean validateTransportId(String transportId) {

        if (!transportId.matches("RTS[0-9]{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }

        return true;
    }

    public String findObjectType(GoodsTransport obj) {

        if (obj instanceof TimberTransport)
            return "TimberTransport";

        else
            return "BrickTransport";
    }
}
