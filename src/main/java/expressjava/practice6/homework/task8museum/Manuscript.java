package expressjava.practice6.homework.task8museum;

public class Manuscript extends Exhibit {

    public Manuscript(String description) {
        super(description, "требует контролируемой влажности");
    }

    @Override
    public void satisfyStorageConditions() {
        System.out.println("Контролируемая влажность для манускрипта предоставлена");
    }
}
