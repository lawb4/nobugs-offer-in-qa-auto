package expressjava.practice4;

import java.util.Scanner;

public class While {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printFactorial();
    }

    public static void printFactorial() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int i = 1;
        int result = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println(result);
    }
}
