package expressjava.practice5.order;

public interface Discountable {
    /**
     * Calculate total discount
     *
     * @param value the discount value
     * @return calculated total discount
     */
    double discount(double value);
}
