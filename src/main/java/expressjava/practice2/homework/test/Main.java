package expressjava.practice2.homework.test;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla", 2016);
        car.setYear(2026);
        car.print();

        Rectangle rectangle = new Rectangle(2.5d, 3.2d);
        rectangle.setWidth(2.7d);
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());

        Book book = new Book("12 Rules for Life", "Jordan Bernt Peterson");
        book.setAuthor("Jordan Peterson");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Yegor", 0d);
        bankAccount.deposit(1000d);
        bankAccount.withdraw(50.25d);
        bankAccount.printBalance();

        Point point = new Point(2.25d, 5.7d);
        point.setX(3.6d);
        point.print();

        StudentGroup studentGroup = new StudentGroup("FRE 501", 10);
        studentGroup.setStudentCount(12);
        studentGroup.printInfo();

        Circle circle = new Circle(2.5d);
        circle.setRadius(3.3d);
        System.out.printf("Circle area: %.2f\n", circle.calculateArea());
        System.out.printf("Circle circumference: %.2f\n", circle.calculateCircumference());

        Teacher teacher = new Teacher("Galina Ivanovna", "Math");
        teacher.setSubject("English");
        teacher.printInfo();

        Product product = new Product("The Ultimate Career Course", 109.99);
        product.setPrice(99.99);
        product.applyDiscount(30);
        product.printInfo();

        Laptop laptop = new Laptop("Macbook M1 Air", 50000d);
        laptop.setPrice(40000d);
        laptop.printInfo();
    }
}
