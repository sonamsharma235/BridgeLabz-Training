import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();


        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;// formula of volume of cylinder

        System.out.println("Volume of Cylinder = " + volume);
    }
}
