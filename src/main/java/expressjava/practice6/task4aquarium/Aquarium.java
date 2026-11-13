package expressjava.practice6.task4aquarium;

import java.util.Objects;

public class Aquarium {
    private SeaCreature seaCreature;

    public void setSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = Objects.requireNonNull(seaCreature);
    }

    public void showSeaCreatureBehavior() {
        if (seaCreature == null) {
            throw new IllegalStateException("Aquarium is empty. Add a sea creature first.");
        }
        seaCreature.act();
    }
}
