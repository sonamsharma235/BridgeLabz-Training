import java.util.*;
import java.util.regex.*;
import java.time.*;

public class ShipmentValidator {

    static boolean isValidCode(String code) {
        if (!code.matches("SHIP-[1-9][0-9]{5}")) return false;

        String digits = code.substring(5);
        int count = 1;

        for (int i = 1; i < digits.length(); i++) {
            if (digits.charAt(i) == digits.charAt(i - 1)) {
                count++;
                if (count > 3) return false;
            } else count = 1;
        }
        return true;
    }

    static boolean isValidDate(String date) {
        if (!date.matches("20\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])"))
            return false;

        try {
            LocalDate.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean isValidMode(String mode) {
        return mode.matches("AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT");
    }

    static boolean isValidWeight(String weight) {
        if (!weight.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?"))
            return false;

        double val = Double.parseDouble(weight);
        return val <= 999999.99;
    }

    static boolean isValidStatus(String status) {
        return status.matches("DELIVERED|CANCELLED|IN_TRANSIT");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String record = sc.nextLine();
            String[] parts = record.split("\\|");

            if (parts.length != 5) {
                System.out.println("NON-COMPLIANT RECORD");
                continue;
            }

            boolean valid = isValidCode(parts[0]) &&
                            isValidDate(parts[1]) &&
                            isValidMode(parts[2]) &&
                            isValidWeight(parts[3]) &&
                            isValidStatus(parts[4]);

            System.out.println(valid ? "COMPLIANT RECORD" : "NON-COMPLIANT RECORD");
        }
    }
}