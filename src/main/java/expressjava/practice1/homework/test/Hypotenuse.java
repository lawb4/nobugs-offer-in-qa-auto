package expressjava.practice1.homework.test;

/*7. Метод для нахождения гипотенузы
Условие:
Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
√(a² + b²)
Вызовите метод с несколькими наборами чисел.*/
public class Hypotenuse {

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        System.out.println(findHypotenuse(2, 3));
        System.out.println(findHypotenuse(0, 3));
        System.out.println(findHypotenuse(2, 0));
    }
}
