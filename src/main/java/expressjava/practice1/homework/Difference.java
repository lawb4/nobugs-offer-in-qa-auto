package expressjava.practice1.homework;

/*3. Метод для нахождения разницы между двумя числами
Условие:
Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
Проверьте метод в main.*/
public class Difference {

    public static int difference(int x, int y) {
        int result;
        if (x >= y) {
            result = x - y;
        } else {
            result = y - x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(difference(5, 2)); //3
        System.out.println(difference(1, 6)); //5
        System.out.println(difference(2, 2)); //0
        System.out.println(difference(-4, 12)); //16
        System.out.println(difference(4, -12)); //16
    }
}
