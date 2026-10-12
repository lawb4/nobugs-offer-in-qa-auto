package expressjava.practice2.homework.test;

/*Создайте класс Laptop с полями brand и price. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий информацию о ноутбуке и его цене. В main измените цену и выведите информацию.*/
public class Laptop {

    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.printf("Laptop");
    }
}
