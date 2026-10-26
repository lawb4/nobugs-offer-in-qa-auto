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
        int n = Integer.parseInt(sc.nextLine());

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
        int dayOfWeek = Integer.parseInt(sc.nextLine());

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
        int grade = Integer.parseInt(sc.nextLine());

        if (grade < 0 || grade > 100) {
            return '\0'; // indicator of invalid grade
        }

        char gradeLetter;
        switch (grade / 10) {
            case 9, 10 -> gradeLetter = 'A';
            case 8 -> gradeLetter = 'B';
            case 7 -> gradeLetter = 'C';
            case 6 -> gradeLetter = 'D';
            default -> gradeLetter = 'F';
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
        double first = Double.parseDouble(sc.nextLine());
        System.out.print("Enter second number: ");
        double second = Double.parseDouble(sc.nextLine());
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.nextLine();

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
