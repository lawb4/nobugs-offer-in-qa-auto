package expressjava.practice1.homework.test;

/*6. Метод для вычисления средней скорости
Условие:
Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
Вызовите метод с разными значениями.*/
public class AverageSpeed {

    public static double averageSpeed(double distance, double time) {
        if (time <= 0 || distance < 0) {
            return 0; // Защита от деления на 0, отрицательного времени и отрицательного расстояния
        }
        return distance / time;
    }

    public static void main(String[] args) {
        System.out.println(averageSpeed(10, 5));
        System.out.println(averageSpeed(5, 10));
        System.out.println(averageSpeed(0, 5));
        System.out.println(averageSpeed(5, 0));
        System.out.println(averageSpeed(0, 0));
        System.out.println(averageSpeed(-5, 10));
    }
}
