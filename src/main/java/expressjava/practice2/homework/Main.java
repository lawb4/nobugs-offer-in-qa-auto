package expressjava.practice2.homework;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla", 2020);
        car.setYear(2026);
        car.print();

        Rectangle rectangle = new Rectangle(2d, 3d);
        rectangle.setWidth(4d);
        System.out.printf("Area: %.2f", rectangle.calculateArea());
    }
}
