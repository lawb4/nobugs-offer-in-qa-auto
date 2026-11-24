package expressjava.practice6.homework.task7amusementpark;

import java.util.Objects;

public class AmusementPark {
    private Ride ride;

    public AmusementPark(Ride ride) {
        this.ride = Objects.requireNonNull(ride);
    }

    public void control() {
        ride.provideMaintenance();
    }

    public void printInfo() {
        ride.printInfo();
    }
}
