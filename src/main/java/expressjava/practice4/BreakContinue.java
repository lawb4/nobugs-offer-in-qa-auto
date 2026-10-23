package expressjava.practice4;

import java.util.Scanner;

public class BreakContinue {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printSumUntilFirstNegativeNumber();
        printNumsExceptDivisibleByThree();
        printOnlyPositives();
        printUntilStop();
    }

    public static void printSumUntilFirstNegativeNumber() {

        int n = 0;
        int sum = 0;
        while (true) {
            System.out.print("Enter num: ");
            n = sc.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
        }
        System.out.println(sum);
    }

    public static void printNumsExceptDivisibleByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printOnlyPositives() {

        while (true) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            System.out.printf("%d \n", num);
        }
    }

    public static void printUntilStop() {

        while (true) {
            System.out.print("Enter string: ");
            String s = sc.nextLine();

            if (s.equals("stop")) {
                break;
            }
        }
    }
}
