package expressjava.practice2.homework;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla", 2020);
        System.out.println(car.getYear());
        car.setYear(2026);
        car.print();

        Rectangle rectangle = new Rectangle(2d, 3d);
        System.out.println(rectangle.getWidth());
        rectangle.setWidth(4d);
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());

        Book book = new Book("12 Rules for Life", "Jordan Peterson");
        System.out.println(book.getAuthor());
        book.setAuthor("Jordan Bernt Peterson");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Yegor", 0d);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100d);
        bankAccount.withdraw(10d);
        bankAccount.printBalance();

        Point point = new Point(2.4d, 2.7d);
        System.out.println(point.getX());
        point.setX(3.2d);
        point.print();

        StudentGroup studentGroup = new StudentGroup("501 FE", 10);
        System.out.println(studentGroup.getStudentCount());
        studentGroup.setStudentCount(8);
        studentGroup.printInfo();

        Circle circle = new Circle(2.5d);
        System.out.println(circle.getRadius());
        circle.setRadius(3.2d);
        System.out.printf("Area: %.2f, circumference: %.2f\n", circle.calculateArea(), circle.calculateCircumference());

        Teacher teacher = new Teacher("Galina Ivanovna", "Math");
        System.out.println(teacher.getSubject());
        teacher.setSubject("English");
        teacher.printInfo();

        Product product = new Product("Course", 109d);
        System.out.println(product.getPrice());
        product.setPrice(100d);
        product.applyDiscount(75);
        System.out.printf("Price: %.2f\n", product.getPrice());

        Laptop laptop = new Laptop("Macbook Pro M1", 50000d);
        System.out.println(laptop.getPrice());
        laptop.setPrice(70000d);
        laptop.printInfo();
    }
}
