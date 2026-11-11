package expressjava.practice5.cinema;

import java.util.LinkedList;
import java.util.List;

public class Row {
    private int rowNumber;
    private List<Seat> seats;

    public Row(int rowNumber) {
        this.rowNumber = rowNumber;
        this.seats = new LinkedList<>();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void addSeat(Seat seat) {

        if (seat.getRowNumber() == rowNumber) {
            seats.add(seat);
        } else {
            throw new IllegalArgumentException(
                    "Seat row " + seat.getRowNumber() +
                            " doesn't match Row " + rowNumber);
        }
    }
}
