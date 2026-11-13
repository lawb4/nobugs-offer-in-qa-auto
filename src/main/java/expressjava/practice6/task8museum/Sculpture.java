package expressjava.practice6.task8museum;

public class Sculpture extends Exhibit {

    public Sculpture() {
        super("Описание скульптуры.",
                "Нуждается в реставрации.");
    }

    @Override
    public void satisfyStorageConditions() {
        System.out.println("Скульптура отреставрирована.");
    }
}
