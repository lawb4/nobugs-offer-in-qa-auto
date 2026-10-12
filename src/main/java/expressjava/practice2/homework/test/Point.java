package expressjava.practice2.homework.test;

/*Создайте класс Point с координатами x и y. Реализуйте конструктор, геттеры, сеттер только для x, и метод print(), выводящий координаты. В main измените x, выведите новые координаты.*/
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void print() {
        System.out.printf("x: %.2f, y: %.2f\n", x, y);
    }
}
