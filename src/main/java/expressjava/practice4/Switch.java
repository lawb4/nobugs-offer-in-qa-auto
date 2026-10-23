package expressjava.practice4;

import java.util.Scanner;

public class Switch {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printDayOfWeekByItsNumber();
        System.out.println(getMovieTicketPrice());
    }

    public static void printDayOfWeekByItsNumber() {
        System.out.print("Enter number (1-7): ");
        int dayOfWeekNum = sc.nextInt();

        String dayOfWeek = "";
        switch (dayOfWeekNum) {
            case 1 -> dayOfWeek = "Понедельник";
            case 2 -> dayOfWeek = "Вторник";
            case 3 -> dayOfWeek = "Среда";
            case 4 -> dayOfWeek = "Четверг";
            case 5 -> dayOfWeek = "Пятница";
            case 6 -> dayOfWeek = "Суббота";
            case 7 -> dayOfWeek = "Воскресенье";
            default -> System.out.println("Введено некорректное значение");
        }
        System.out.println(dayOfWeek);
    }

    public static double getMovieTicketPrice() {
        System.out.print("Enter day of week (1-7): ");
        int dayOfWeek = sc.nextInt();

        double price = 0d;
        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> price = 300d;
            case 6, 7 -> price = 450d;
            default -> System.out.println("Invalid value");
        }
        return price;
    }
}
