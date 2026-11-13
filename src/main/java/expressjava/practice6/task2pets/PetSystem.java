package expressjava.practice6.task2pets;

import java.util.Objects;

public class PetSystem {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = Objects.requireNonNull(pet);
    }

    public void interact() {
        if (this.pet == null) {
            throw new IllegalStateException("There is no pet to interact with.");
        }

        this.pet.act();
        this.pet.eat();
    }
}
