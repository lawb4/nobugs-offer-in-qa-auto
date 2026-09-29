package expressjava.practice1.homework.test;
/*4. Методы для площади и периметра квадрата
Условие:
Создайте два метода:
squareArea(int side) — возвращает площадь квадрата
squarePerimeter(int side) — возвращает периметр
Вызовите оба метода в main с примером.*/

/*
Площадь квадрата S равна квадрату длины его стороны: S = a^2, где a — длина стороны.
Формула периметра квадрата: P = 4 * a, где P — это периметр, и a — длина одной стороны квадрата.
*/
public class SquareMethods {

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        System.out.println(squareArea(2));
        System.out.println(squarePerimeter(2));
    }
}
