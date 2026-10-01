package expressjava.practice1.homework;

/*10. Методы перевода температуры
Условие:
Создайте два метода:
celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
Проверьте оба метода в main.*/
public class TemperatureConversion {

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(-10));
        System.out.println(fahrenheitToCelsius(30));
        System.out.println(fahrenheitToCelsius(0));
        System.out.println(fahrenheitToCelsius(-10));
    }
}
