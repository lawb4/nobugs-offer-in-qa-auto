package expressjava.practice1.homework;

public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 5));

        System.out.println(subtract(10, 5));

        System.out.println(multiply(10, 5));

        System.out.println(divide(10, 5));
        System.out.println(divide(10, 0));

        System.out.println(findMax(2, 3));
        System.out.println(findMax(4, 2));
        System.out.println(findMax(0, 1));
        System.out.println(findMax(6, -5));

        System.out.println(difference(5, 2));
        System.out.println(difference(1, 6));
        System.out.println(difference(2, 2));
        System.out.println(difference(-4, 12));
        System.out.println(difference(4, -12));

        System.out.println(squareArea(2));

        System.out.println(squarePerimeter(3));

        System.out.println(convertSecondsToMinutes(60));
        System.out.println(convertSecondsToMinutes(59));
        System.out.println(convertSecondsToMinutes(61));

        System.out.println(averageSpeed(5, 20));
        System.out.println(averageSpeed(30, 10));
        System.out.println(averageSpeed(-5, 15));
        System.out.println(averageSpeed(5, 0));
        System.out.println(averageSpeed(5, -10));
        System.out.println(averageSpeed(0, 20));

        System.out.println(findHypotenuse(2, 3));
        System.out.println(findHypotenuse(1, -2));
        System.out.println(findHypotenuse(2, 0));
        System.out.println(findHypotenuse(0, 3));

        System.out.println(circleCircumference(2));
        System.out.println(circleCircumference(0));
        System.out.println(circleCircumference(-3));

        System.out.println(calculatePercentage(200, 25));
        System.out.println(calculatePercentage(25, 200));
        System.out.println(calculatePercentage(100, 0));
        System.out.println(calculatePercentage(0, 100));

        System.out.println(celsiusToFahrenheit(30));
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(-10));

        System.out.println(fahrenheitToCelsius(30));
        System.out.println(fahrenheitToCelsius(0));
        System.out.println(fahrenheitToCelsius(-10));
    }
}
