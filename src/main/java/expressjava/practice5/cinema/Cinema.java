package expressjava.practice5.cinema;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cinema {
    private List<Hall> halls;
    private List<Movie> movies;

    public Cinema() {
        halls = new LinkedList<>();
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public boolean bookSession(Customer customer, Session session, Seat seat) {

        boolean isSessionBooked = false;
        if (session.isSeatAvailable(seat)) {
            Booking booking = new Booking(customer, session, List.of(seat));
            session.addBooking(booking);
            customer.addBooking(booking);
            isSessionBooked = true;
        }
        return isSessionBooked;
    }
}
