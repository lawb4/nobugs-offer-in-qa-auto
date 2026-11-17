package expressjava.practice4.homework;

import java.util.Scanner;

public class BreakContinue {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getSumOfNumbersTillFirstNegativeNumber());
        printNumbersExceptDivisibleByThree();
        System.out.println();
        printOnlyPositiveNumbers();
        promptForStrings();
    }

    public static int getSumOfNumbersTillFirstNegativeNumber() {

        int sum = 0;
        while (true) {
            System.out.print("Enter num: ");
            int n = Integer.parseInt(sc.nextLine());

            if (n < 0) {
                break;
            }
            sum += n;
        }
        return sum;
    }

    public static void printNumbersExceptDivisibleByThree() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }

    public static void printOnlyPositiveNumbers() {

        while (true) {
            System.out.print("Enter number: ");
            int n = Integer.parseInt(sc.nextLine());

            if (n == 0) {
                break;
            }

            if (n < 0) {
                continue;
            }

            System.out.printf("%d \n", n);
        }
    }

    public static void promptForStrings() {

        while (true) {
            System.out.print("Enter string: ");
            String s = sc.nextLine();

            if (s.equals("stop")) {
                break;
            }
        }
    }
}
