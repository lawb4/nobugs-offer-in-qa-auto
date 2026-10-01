package expressjava.practice1.homework;

/*5. Метод для перевода секунд в минуты
Условие:
Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
Вызовите метод в main и выведите результат.*/
public class TimeConversion {

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static void main(String[] args) {
        System.out.println(convertSecondsToMinutes(60)); //1.0
        System.out.println(convertSecondsToMinutes(59)); //<1..
        System.out.println(convertSecondsToMinutes(61)); //>1..
    }
}
