public class OTPGenerator {
    static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {

        int[] otps = new int[10];
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        boolean result = areOTPsUnique(otps);

        if (result) {
            System.out.println("\nAll 10 OTPs are unique ✅");
        } else {
            System.out.println("\nDuplicate OTP found ❌");
        }
    }
}
