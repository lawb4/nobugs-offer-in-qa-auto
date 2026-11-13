package expressjava.practice6.task8museum;

public class Manuscript extends Exhibit {

    public Manuscript() {
        super("Описание манускрипта.",
                "Требует контролируемой влажности.");
    }

    @Override
    public void satisfyStorageConditions() {
        System.out.println("Контролируемая влажность для манускрипта предоставлена.");
    }
}
