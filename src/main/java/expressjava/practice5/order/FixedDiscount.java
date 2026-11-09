package expressjava.practice5.order;

public class FixedDiscount implements Discountable {
    private double fixSum;

    public FixedDiscount(double fixSum) {
        this.fixSum = fixSum;
    }

    @Override
    public double discount(double value) {
        return fixSum;
    }
}
