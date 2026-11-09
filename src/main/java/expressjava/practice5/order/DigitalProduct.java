package expressjava.practice5.order;

public class DigitalProduct extends Product {
    private int fileSize;

    public DigitalProduct(String name, int price, int fileSize) {
        super(name, price);
        this.fileSize = fileSize;
    }
}
