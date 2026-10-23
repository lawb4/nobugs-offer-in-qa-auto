package expressjava.practice4;

import java.util.Scanner;

public class DoWhile {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        promptForNumberUntilPositive();
        promptForPassword();
    }

    public static void promptForNumberUntilPositive() {
        int n = 0;
        do {
            System.out.print("Enter number: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Positive number was provided, exiting now");
    }

    public static void promptForPassword() {

        String pass;
        do {
            System.out.print("Enter password: ");
            pass = sc.nextLine();
        } while (!pass.equals("pa$$123"));
        System.out.println("Password is correct");
    }
}
