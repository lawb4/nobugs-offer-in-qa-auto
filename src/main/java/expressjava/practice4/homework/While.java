package expressjava.practice4.homework;

import java.util.Scanner;

public class While {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getFactorial());
        printEvenNumbersTillBoundary();
        printReverseCount();
    }

    public static int getFactorial() {
        System.out.print("Enter num: ");
        int n = sc.nextInt();

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
        int n = sc.nextInt();

        int i = 1;
        while (i < n) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
            i++;
        }
    }

    public static void printReverseCount() {
        System.out.print("Enter positive number: ");
        int number = sc.nextInt();

        while (number >= 1) {
            System.out.printf("%d ", number);
            number--;
        }
    }
}
