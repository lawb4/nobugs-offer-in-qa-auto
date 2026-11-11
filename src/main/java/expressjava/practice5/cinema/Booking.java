package expressjava.practice5.cinema;

import java.util.List;

public class Booking {
    private Customer customer;
    private Session session;
    private List<Seat> seats;
    private double price;

    public Booking(Customer customer, Session session, List<Seat> seats) {
        this.customer = customer;
        this.session = session;
        this.seats = seats;
    }

    public void calculatePrice() {
        //VIP strategy
        //WallDiscountBased strategy
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
