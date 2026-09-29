package expressjava.practice1;

public class HelloWorld {
    static int a = 1;

    public static void main(String[] args) {
        final int sum = sum(1, 2);
        System.out.println("Sum: " + sum);

        int multiplication = multiply(3, 2);
        System.out.println("Product: " + multiplication);

        int subtraction = subtract(10, 3);
        System.out.println("Difference: " + subtraction);

        double division = divide(3, 2);
        System.out.println("Quotient: " + division);
    }

    public static int sum(int addend1, int addend2) {
        return addend1 + addend2;
    }

    public static int multiply(int multiplicand, int multiplier) {
        int multiplication = multiplicand * multiplier;
        return multiplication;
    }

    public static int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static double divide(int divisor, int dividend) {
        return (double) divisor / dividend;
    }
}