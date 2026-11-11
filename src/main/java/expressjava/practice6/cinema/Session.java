package expressjava.practice6.cinema;

import java.util.LinkedList;
import java.util.List;

public class Session {
    private Hall hall;
    private Movie movie;
    private String date;
    private List<Booking> bookings;

    public Session(Hall hall, Movie movie, String date) {
        this.hall = hall;
        this.movie = movie;
        this.date = date;
        this.bookings = new LinkedList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public boolean isSeatAvailable(Seat seat) {
        boolean isSeatAvailable = true;
        for (Booking booking : bookings) {
            if (booking.getSeats().contains(seat)) {
                isSeatAvailable = false;
                break;
            }
        }
        return isSeatAvailable;
    }
}
