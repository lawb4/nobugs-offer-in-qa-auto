package expressjava.practice6.homework.task4aquarium;

import java.util.Objects;

public class Aquarium {
    private SeaCreature seaCreature;

    public void setSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = Objects.requireNonNull(seaCreature);
    }

    public void showBehavior() {
        if (seaCreature == null) {
            throw new IllegalStateException("В аквариуме нет морского существа");
        }
        seaCreature.act();
    }
}
