package expressjava.practice4.homework;

import java.util.Scanner;

/*1. Определение знака числа
Задача:
Напишите программу, которая принимает с консоли число и проверяет:
Если число больше 0, выведите "Число положительное".
Если меньше 0 — "Число отрицательное".
Если равно 0 — "Число равно нулю".
Методы и конструкции:
Scanner
if, else if, else
System.out.println()*/
public class IfElse {

    public static void determineNumberSign() {
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
        System.out.println(result);
    }
}
