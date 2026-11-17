package expressjava.practice6.homework.task5farm;

import java.util.Objects;

public class Farm {
    private DomesticAnimal domesticAnimal;

    public Farm(DomesticAnimal domesticAnimal) {
        this.domesticAnimal = Objects.requireNonNull(domesticAnimal);
    }

    public void control() {
        System.out.println(domesticAnimal + " " + domesticAnimal.getNeed());
        System.out.println(domesticAnimal + " " + domesticAnimal.function());
    }
}
