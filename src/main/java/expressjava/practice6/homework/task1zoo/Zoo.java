package expressjava.practice6.homework.task1zoo;

import java.util.Objects;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = Objects.requireNonNull(animal);
    }

    public void showBehavior() {
        if (animal == null) {
            throw new IllegalStateException("В зоопарке нет животного");
        }
        animal.makeSound();
        animal.move();
    }
}
