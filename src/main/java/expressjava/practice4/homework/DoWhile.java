package expressjava.practice4.homework;

import java.util.Scanner;

public class DoWhile {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        promptForPositiveNumber();
        verifyPassword();
        printNumbersFromOneToTen();
        System.out.println();
        promptForExitCommand();
        System.out.println(getDigitsInNumber());
    }

    public static void promptForPositiveNumber() {

        int number;
        do {
            System.out.print("Enter number: ");
            number = Integer.parseInt(sc.nextLine());
        } while (number <= 0);
    }

    public static void verifyPassword() {

        String pass;
        do {
            System.out.print("Enter password: ");
            pass = sc.nextLine();
        } while (!pass.equals("admin123"));
    }

    public static void printNumbersFromOneToTen() {

        int i = 1;
        do {
            System.out.printf("%d ", i);
            i++;
        } while (i <= 10);
    }

    public static void promptForExitCommand() {

        String cmd;
        do {
            System.out.print("Enter command: ");
            cmd = sc.nextLine();
        } while (!cmd.equals("exit"));
    }

    public static int getDigitsInNumber() {

        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());

        int count = 0;

        do {
            n /= 10;
            count++;
        } while (n != 0);
        return count;
    }
}
