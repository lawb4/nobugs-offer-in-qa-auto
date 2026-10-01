package expressjava.practice1.homework;

/*4. Методы для площади и периметра квадрата
Условие:
Создайте два метода:
squareArea(int side) — возвращает площадь квадрата
squarePerimeter(int side) — возвращает периметр
Вызовите оба метода в main с примером.*/

public class SquareMethods {

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        System.out.println(squareArea(2)); // 4
        System.out.println(squarePerimeter(3)); // 12
    }
}
