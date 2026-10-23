package expressjava.practice4;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        System.out.println(determineNumberSign());
        printGreaterNumberOutOfTwo();
        printGradeAsText();
        System.out.println(checkForParity());
        System.out.println(getDiscountBasedOnAge());
        printTestResultGradeAsText();
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

    public static void printGradeAsText() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите оценку (1-5): ");
        int grade = sc.nextInt();

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
            result = "Введено неверное значение!";
        }
        System.out.println(result);
    }

    public static String checkForParity() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String result;
        if (num % 2 == 0) {
            result = "Чётное";
        } else result = "Нечётное";
        return result;
    }

    public static int getDiscountBasedOnAge() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        int discountPercentage;
        if (age <= 18 && age > 0) {
            discountPercentage = 25;
        } else if (age >= 65) {
            discountPercentage = 30;
        } else {
            discountPercentage = 0;
        }
        return discountPercentage;
    }

    public static void printTestResultGradeAsText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test result grade (0-100): ");
        int testResultGrade = sc.nextInt();

        String result = "Введена некорректная оценка";
        if (testResultGrade >= 90 && testResultGrade <= 100) {
            result = "Отлично";
        } else if (testResultGrade >= 75 && testResultGrade <= 89) {
            result = "Хорошо";
        } else if (testResultGrade >= 60 && testResultGrade <= 74) {
            result = "Удовлетворительно";
        } else if (testResultGrade >= 0 && testResultGrade < 60) {
            result = "Неудовлетворительно";
        }
        System.out.println(result);
    }
}
