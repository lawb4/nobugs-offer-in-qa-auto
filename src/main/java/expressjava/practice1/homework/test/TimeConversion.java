package expressjava.practice1.homework.test;
/*5. Метод для перевода секунд в минуты
Условие:
Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
Вызовите метод в main и выведите результат.*/
public class TimeConversion {

    public static double convertSecondsToMinutes (int seconds) {
        return (double) seconds / 60; // приведение к double, чтобы вернуть дробное число
    }

    public static void main(String[] args) {
        System.out.println(convertSecondsToMinutes(59));
        System.out.println(convertSecondsToMinutes(60));
        System.out.println(convertSecondsToMinutes(61));
    }
}
