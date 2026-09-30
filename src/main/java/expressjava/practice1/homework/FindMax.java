package expressjava.practice1.homework;

/*2. Реализуйте метод для нахождения максимума двух чисел
Условие:
Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
Вызовите метод в main и выведите результат.*/
public class FindMax {

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3)); //3
        System.out.println(findMax(4, 2)); //4
        System.out.println(findMax(0, 1)); //1
        System.out.println(findMax(6, -5)); //6
    }
}
