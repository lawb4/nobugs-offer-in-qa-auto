package expressjava.practice4;


import java.util.Scanner;

public class For {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printNumbersDivisiblebyThree();
        System.out.println(getSumOfNumFromOneToN());
        printTimesTable();
    }

    public static void printNumbersDivisiblebyThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static int getSumOfNumFromOneToN() {
        System.out.print("Enter number (n): ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printTimesTable() {
        System.out.print("Enter number for which you want times table to be printed: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
