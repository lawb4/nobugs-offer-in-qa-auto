package expressjava.practice2.homework.test;

/*Создайте класс Product с полями name и price. Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки, и метод printInfo(), выводящий информацию о товаре и цене. В main измените цену, примените скидку и выведите цену.*/
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
        // discount value in percentage
        if (discount >= 0 && discount <= 100) {
            price -= price * (discount / 100.0);
        } else {
            System.out.println("Discount value is incorrect");
        }
    }

    public void printInfo() {
        System.out.printf("Product: %s, price: %.2f\n", name, price);
    }
}
