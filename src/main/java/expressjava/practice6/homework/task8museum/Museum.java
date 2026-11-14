package expressjava.practice6.homework.task8museum;

import java.util.Objects;

public class Museum {
    private final Exhibit exhibit;

    public Museum(Exhibit exhibit) {
        this.exhibit = Objects.requireNonNull(exhibit);
    }

    public void control() {
        exhibit.satisfyStorageConditions();
    }

    public void printInfo() {
        System.out.println(exhibit);
    }
}
