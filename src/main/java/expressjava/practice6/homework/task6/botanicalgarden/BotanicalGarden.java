package expressjava.practice6.homework.task6.botanicalgarden;

import java.util.Objects;

public class BotanicalGarden {
    private Plant plant;

    public BotanicalGarden(Plant plant) {
        this.plant = Objects.requireNonNull(plant);
    }

    public void setPlant(Plant plant) {
        this.plant = Objects.requireNonNull(plant);
    }

    public void provideCare() {
        plant.satisfyNeed();
    }
}
