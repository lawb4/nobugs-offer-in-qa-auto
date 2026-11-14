package expressjava.practice6.homework.task8museum;

public class Sculpture extends Exhibit {

    public Sculpture(String description) {
        super(description, "нуждается в реставрации");
    }

    @Override
    public void satisfyStorageConditions() {
        System.out.println("Скульптура отреставрирована");
    }
}
