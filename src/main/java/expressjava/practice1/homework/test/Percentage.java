package expressjava.practice1.homework.test;

/*9. Метод для вычисления процентов
Условие:
Создайте метод calculatePercentage(double total, double part)
— возвращает, какой процент от общего составляет часть.
Пример: 25 из 200 → 12.5%
*/
public class Percentage {

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static void main(String[] args) {
        System.out.println(calculatePercentage(200, 25));
    }
}
