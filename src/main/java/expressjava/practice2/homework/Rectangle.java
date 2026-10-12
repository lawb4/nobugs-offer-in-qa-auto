package expressjava.practice2.homework;

public class Rectangle {

    private double widht;
    private double height;

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double widht) {
        this.widht = widht;
    }

    public double calculateArea() {
        return widht * height;
    }
}
