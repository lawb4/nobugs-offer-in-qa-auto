package expressjava.practice1.homework.test;

/*8. Метод для длины окружности
Условие:
Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
Проверьте работу на нескольких значениях.*/
public class CircleCircumference {

    public static double circleCircumference(double radius) {
        if (radius < 0) {
            return 0; // check for invalid radius
        }
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println(circleCircumference(2));
        System.out.println(circleCircumference(1));
        System.out.println(circleCircumference(0));
        System.out.println(circleCircumference(-1));
    }
}
