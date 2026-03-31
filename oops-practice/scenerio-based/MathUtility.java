class MathUtility {
    static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}

public class MathApp {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + MathUtility.factorial(5));
        System.out.println("Is 7 prime? " + MathUtility.isPrime(7));
        System.out.println("GCD of 12 and 18: " + MathUtility.gcd(12, 18));
        System.out.println("Fibonacci of 6: " + MathUtility.fibonacci(6));

        System.out.println("Factorial of -3: " + MathUtility.factorial(-3));
        System.out.println("Is 1 prime? " + MathUtility.isPrime(1));
        System.out.println("Fibonacci of 0: " + MathUtility.fibonacci(0));
    }
}
