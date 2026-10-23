package expressjava.practice4;

import java.util.Scanner;

public class Switch {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printDayOfWeekByItsNumber();
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
}
