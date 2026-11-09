package expressjava.practice5.order;

import java.util.LinkedList;
import java.util.List;

public class Order {

    private List<Product> products;
    private List<Discountable> discounts;

    public Order() {
        this.products = new LinkedList<>();
        this.discounts = new LinkedList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public void addDiscount(Discountable discount) {
        discounts.add(discount);
    }

    public double calculateTotalPrice() {

        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        for (Discountable discount : discounts) {
            totalPrice -= discount.discount(totalPrice);
        }
        return totalPrice;
    }
}
