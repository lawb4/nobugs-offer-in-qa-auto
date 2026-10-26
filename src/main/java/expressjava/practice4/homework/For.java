package expressjava.practice4.homework;

import java.util.Scanner;

public class For {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printNumbersFromOneToHundredExceptDivisibleByThree();
        System.out.println();
        System.out.println(getSumOfNumbersFromOneToN());
        printTimesTable();
        System.out.println(isPrime());
        printNumbersFromOneToTen();
    }

    public static void printNumbersFromOneToHundredExceptDivisibleByThree() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static int getSumOfNumbersFromOneToN() {
        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printTimesTable() {
        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }

    public static boolean isPrime() {
        System.out.print("Enter num: ");
        int n = Integer.parseInt(sc.nextLine());

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printNumbersFromOneToTen() {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", i);
        }
    }
}
