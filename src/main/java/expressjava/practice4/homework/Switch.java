package expressjava.practice4.homework;

import java.util.Scanner;

public class Switch {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printDayOfWeekByItsNumber();
        System.out.println(getTicketPriceByDayOfWeek());
        System.out.println(convertGradeToLetter());
        printCommandMessage();
        printCalculationResult();
    }

    public static void printDayOfWeekByItsNumber() {
        System.out.print("Введите день недели (1-7): ");
        int n = sc.nextInt();

        String result;
        switch (n) {
            case 1 -> result = "Понедельник";
            case 2 -> result = "Вторник";
            case 3 -> result = "Среда";
            case 4 -> result = "Четверг";
            case 5 -> result = "Пятница";
            case 6 -> result = "Суббота";
            case 7 -> result = "Воскресенье";
            default -> result = "Введено неверное значение";
        }
        System.out.println(result);
    }

    public static int getTicketPriceByDayOfWeek() {
        System.out.print("На какой день недели посчитать стоимость билета? ");
        int dayOfWeek = sc.nextInt();

        int price;
        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> price = 300;
            case 6, 7 -> price = 450;
            default -> price = 0;
        }
        return price;
    }

    public static char convertGradeToLetter() {
        System.out.print("Enter grade (0-100): ");
        int grade = sc.nextInt();

        char gradeLetter;
        switch (grade / 10) {
            case 9, 10 -> gradeLetter = 'A';
            case 8 -> gradeLetter = 'B';
            case 7 -> gradeLetter = 'C';
            case 6 -> gradeLetter = 'D';
            case 5, 4, 3, 2, 1, 0 -> gradeLetter = 'F';
            default -> gradeLetter = 0;
        }
        return gradeLetter;
    }

    public static void printCommandMessage() {
        System.out.print("Enter command: ");
        String cmd = sc.nextLine();

        String result;
        switch (cmd) {
            case "start" -> result = "System is starting";
            case "stop" -> result = "System is stopping";
            case "restart" -> result = "System is restarting";
            case "status" -> result = "System status: ...";
            default -> result = "Incorrect command";
        }
        System.out.println(result);
    }

    public static void printCalculationResult() {
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.next();

        switch (operator) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "*" -> System.out.println(first * second);
            case "/" -> {
                if (second == 0) {
                    System.out.println("Division by zero");
                } else {
                    System.out.println(first / second);
                }
            }
            default -> System.out.println("Incorrect operator");
        }
    }
}
