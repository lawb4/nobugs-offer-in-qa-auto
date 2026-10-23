package expressjava.practice4;

import java.util.Scanner;

public class BreakContinue {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printSumUntilFirstNegativeNumber();
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
}
