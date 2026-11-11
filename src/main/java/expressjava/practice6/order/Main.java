package expressjava.practice6.order;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.addProduct(new DigitalProduct("Лекция", 30, 30));
        order.addProducts(List.of(
                new PhysicalProduct("Яблоко", 10, 100),
                new DigitalProduct("Песня", 5, 3)
        ));
        order.addDiscount(new PercentageDiscount(20));
        order.addDiscount(new FixedDiscount(10));
        System.out.printf("Total price is: %f", order.calculateTotalPrice());
    }
}
