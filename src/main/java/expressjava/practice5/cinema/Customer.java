package expressjava.practice5.cinema;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private String id;
    private List<Booking> bookings;

    public Customer(String id) {
        this.id = id;
        this.bookings = new LinkedList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public String getId() {
        return id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
