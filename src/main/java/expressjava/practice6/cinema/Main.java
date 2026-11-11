package expressjava.practice6.cinema;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Customer customer1 = new Customer("1");

        Hall hall1 = new Hall(1);
        cinema.addHall(hall1);

        Row row1 = new Row(1);
        Seat row1seat1 = new Seat(row1.getRowNumber(), 1);
        row1.addSeat(row1seat1);

        Seat row1seat2 = new Seat(row1.getRowNumber(), 2);
        row1.addSeat(row1seat2);

        Row row2 = new Row(2);
        Seat row2seat1 = new Seat(row2.getRowNumber(), 1);
        row2.addSeat(row2seat1);

        Seat row2seat2 = new Seat(row2.getRowNumber(), 2);
        row2.addSeat(row2seat2);

        hall1.addRow(row1);
        hall1.addRow(row2);

        Movie movie1 = new Movie("Movie Title");
        cinema.addMovie(movie1);

        Session session1 = new Session(hall1, movie1, "Today");

        System.out.println(session1.isSeatAvailable(row1seat2)); // true
        System.out.println(cinema.bookSession(customer1, session1, row1seat2)); // true
        System.out.println(session1.isSeatAvailable(row1seat2)); // false
        System.out.println(customer1.getBookings().size()); // 1
        System.out.println(session1.isSeatAvailable(new Seat(2, 2))); // true
        System.out.println(session1.isSeatAvailable(new Seat(1, 2))); // false

        Movie movie2 = new Movie("Movie Title2");
        cinema.addMovie(movie2);

        Session session2 = new Session(hall1, movie2, "Tomorrow");
        System.out.println(session2.isSeatAvailable(new Seat(1, 2))); // true
    }
}
