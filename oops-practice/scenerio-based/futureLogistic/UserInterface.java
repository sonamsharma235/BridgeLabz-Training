import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Goods Transport details");

        String input = sc.nextLine();

        Utility util = new Utility();

        String id = input.split(":")[0];

        if (!util.validateTransportId(id)) {
            System.out.println("Please provide a valid record");
            return;
        }

        GoodsTransport obj = util.parseDetails(input);

        String type = util.findObjectType(obj);

        System.out.println("\nTransporter id : " + obj.getTransportId());
        System.out.println("Date of transport : " + obj.getTransportDate());
        System.out.println("Rating of the transport : " + obj.getTransportRating());

        if (type.equals("BrickTransport")) {

            BrickTransport b = (BrickTransport) obj;

            System.out.println("Quantity of bricks : " + b.getBrickQuantity());
            System.out.println("Brick price : " + b.getBrickPrice());
            System.out.println("Vehicle for transport : " + b.vehicleSelection());
        } 
        else {

            TimberTransport t = (TimberTransport) obj;

            System.out.println("Type of the timber : " + t.getTimberType());
            System.out.println("Timber price per kilo : " + t.getTimberPrice());
            System.out.println("Vehicle for transport : " + t.vehicleSelection());
        }

        System.out.println("Total charge : " + obj.calculateTotalCharge());
    }
}
