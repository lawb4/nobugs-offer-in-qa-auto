package expressjava.practice6.homework.task2pets;

import java.util.Objects;

public class PetSystem {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = Objects.requireNonNull(pet);
    }

    public void interact() {
        if (pet == null) {
            throw new IllegalStateException("В системе нет питомца");
        }
        pet.act();
        pet.eat();
    }
}
