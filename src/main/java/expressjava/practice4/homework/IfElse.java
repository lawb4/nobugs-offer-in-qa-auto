package expressjava.practice4.homework;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        System.out.println(determineNumberSign());
        printGreaterNumberOutOfTwo();
    }

    public static String determineNumberSign() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result;

        if (num > 0) {
            result = "Число положительное";
        } else if (num < 0) {
            result = "Число отрицательное";
        } else {
            result = "Число равно нулю";
        }
        return result;
    }

    public static void printGreaterNumberOutOfTwo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int result;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        System.out.println("The greater number is " + result);
    }
}
