package expressjava.practice2.homework;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(int discount) {
        if (discount >= 0 && discount <= 100) {
            price -= price * (discount / 100d);
        } else {
            System.out.println("Discount value is invalid");
        }
    }

    public void printInfo() {
        System.out.printf("Product: %s, price: %.2f\n", name, price);
    }

}
