package expressjava.practice4.homework;

import java.util.Scanner;

public class IfElse {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printNumberSign();
        printMaxNumbersOfTwoNumbers();
        printGrade();
        System.out.println(isEven());
        System.out.println(getDiscountByAge());
        printTestResult();
    }

    public static void printNumberSign() {
        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());

        String result;
        if (n > 0) {
            result = "Число положительное";
        } else if (n < 0) {
            result = "Число отрицательное";
        } else {
            result = "Число равно нулю";
        }
        System.out.println(result);
    }

    public static void printMaxNumbersOfTwoNumbers() {
        System.out.print("Enter first number: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.print("Enter second number: ");
        int second = Integer.parseInt(sc.nextLine());

        int result;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        System.out.println(result);
    }

    public static void printGrade() {
        System.out.print("Enter grade (1-5): ");
        int grade = Integer.parseInt(sc.nextLine());

        String result;
        if (grade == 5) {
            result = "Отлично";
        } else if (grade == 4) {
            result = "Хорошо";
        } else if (grade == 3) {
            result = "Удовлетворительно";
        } else if (grade == 2 || grade == 1) {
            result = "Неудовлетворительно";
        } else {
            result = "Введена неверная оценка";
        }
        System.out.println(result);
    }

    public static boolean isEven() {
        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());

        boolean isEven;
        if (n % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }

    public static int getDiscountByAge() {
        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        int discount = 0;
        if (age < 18 && age > 0) {
            discount = 25;
        } else if (age >= 65) {
            discount = 30;
        }
        return discount;
    }

    public static void printTestResult() {
        System.out.print("Enter test grade (0-100): ");
        int grade = Integer.parseInt(sc.nextLine());

        String result;
        if (grade >= 90 && grade <= 100) {
            result = "Отлично";
        } else if (grade >= 75 && grade <= 89) {
            result = "Хорошо";
        } else if (grade >= 60 && grade <= 74) {
            result = "Удовлетворительно";
        } else if (grade < 60 && grade >= 0) {
            result = "Неудовлетворительно";
        } else {
            result = "Введена неверная оценка";
        }
        System.out.println(result);
    }
}
