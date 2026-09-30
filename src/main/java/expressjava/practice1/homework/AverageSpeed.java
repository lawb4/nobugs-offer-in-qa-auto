package expressjava.practice1.homework;

/*6. Метод для вычисления средней скорости
Условие:
Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
Вызовите метод с разными значениями.*/
public class AverageSpeed {

    public static double averageSpeed(double distance, double time) {
        if (distance < 0 || time <= 0) {
            return 0;
        }
        return distance / time;
    }

    public static void main(String[] args) {
        System.out.println(averageSpeed(5, 20)); // 5/20 = 0.25
        System.out.println(averageSpeed(30, 10)); // 30/10 = 3.0
        System.out.println(averageSpeed(-5, 15)); // 0.0
        System.out.println(averageSpeed(5, 0)); // 0.0
        System.out.println(averageSpeed(5, -10)); // 0.0
        System.out.println(averageSpeed(0, 20)); // 0.0
    }
}
