package expressjava.practice6.task6botanicalgarden;

import java.util.Objects;

public class BotanicalGarden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = Objects.requireNonNull(plant);
    }

    public void provideCare() {
        if (plant == null) {
            throw new IllegalStateException("У ботанического сада нет растения, за которым можно было бы заботиться.");
        }
        plant.satisfyNeed();
    }
}
