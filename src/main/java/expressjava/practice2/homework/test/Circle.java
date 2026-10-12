package expressjava.practice2.homework.test;

/*Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference(). В main измените радиус, выведите площадь и длину окружности.*/
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
