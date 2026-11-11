package expressjava.practice6.cinema;

import java.util.Objects;

public class Seat {
    private int rowNumber;
    private int seatNumber;
    private boolean isVip;

    public Seat(int rowNumber, int seatNumber) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        isVip = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isVip() {
        return isVip;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return rowNumber == seat.rowNumber && seatNumber == seat.seatNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowNumber, seatNumber);
    }
}
