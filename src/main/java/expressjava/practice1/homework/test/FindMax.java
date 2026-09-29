package expressjava.practice1.homework.test;

/*2. Реализуйте метод для нахождения максимума двух чисел
Условие:
Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
Вызовите метод в main и выведите результат.*/
public class FindMax {

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
    }
}
