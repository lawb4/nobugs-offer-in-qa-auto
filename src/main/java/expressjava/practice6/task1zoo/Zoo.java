package expressjava.practice6.task1zoo;

import java.util.Objects;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = Objects.requireNonNull(animal, "The animal parameter must not be null.");
    }

    public void showBehavior() {

        if (this.animal == null) {
            throw new IllegalStateException("There is no animal in Zoo.");
        }

        this.animal.makeSound();
        this.animal.move();
    }
}
