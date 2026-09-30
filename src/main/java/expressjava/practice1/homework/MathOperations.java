package expressjava.practice1.homework;

/*1. Напишите класс MathOperations
Условие:
Создайте класс MathOperations с методами:
add(int x, int y) — возвращает сумму двух чисел
subtract(int x, int y) — разницу
multiply(int x, int y) — произведение
divide(int x, int y) — результат деления в double
В main вызовите каждый метод с произвольными числами и выведите результат.
*/
public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 5)); //15
        System.out.println(subtract(10, 5)); //5
        System.out.println(multiply(10, 5)); //50
        System.out.println(divide(10, 5)); //2
        System.out.println(divide(10, 0)); //0
    }
}
