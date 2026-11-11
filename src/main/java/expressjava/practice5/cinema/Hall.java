package expressjava.practice5.cinema;

import java.util.LinkedList;
import java.util.List;

public class Hall {
    private int hallNumber;
    private List<Row> rows;

    public Hall(int hallNumber) {
        this.hallNumber = hallNumber;
        this.rows = new LinkedList<>();
    }

    public List<Row> getRows() {
        return rows;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void addRow(Row row) {
        rows.add(row);
    }
}
