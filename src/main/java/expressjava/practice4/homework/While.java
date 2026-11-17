package expressjava.practice4.homework;

import java.util.Scanner;

public class While {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println(getFactorial());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
        printEvenNumbersTillBoundary();
        System.out.println();
        printReverseCount();
    }

    public static int getFactorial() {
        System.out.print("Enter num: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static void printEvenNumbersTillBoundary() {
        System.out.print("Enter boundary number: ");
        int n = Integer.parseInt(sc.nextLine());

        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
            i++;
        }
    }

    public static void printReverseCount() {
        System.out.print("Enter positive number: ");
        int number = Integer.parseInt(sc.nextLine());

        while (number >= 1) {
            System.out.printf("%d ", number);
            number--;
        }
    }
}
