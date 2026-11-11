package expressjava.practice6.order;

public class PhysicalProduct extends Product {
    private int weight;

    public PhysicalProduct(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }
}
