package expressjava.practice2.homework.test;

/*Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины и высоты, сеттер только для ширины и метод calculateArea() для расчёта площади. В main создайте прямоугольник, измените ширину и выведите площадь.
 */
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }
}
