package expressjava.practice6.amusementpark;

import java.util.Objects;

public class AmusementPark {
    private Ride ride;

    public AmusementPark(Ride ride) {
        this.ride = Objects.requireNonNull(ride);
    }

    public void control() {
        ride.performMaintenance();
    }

    public void printInfo() {
        ride.printInfo();
    }
}
