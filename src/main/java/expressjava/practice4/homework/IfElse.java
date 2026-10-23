package expressjava.practice4.homework;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        System.out.println(determineNumberSign());
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
}
