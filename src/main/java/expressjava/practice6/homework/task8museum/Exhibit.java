package expressjava.practice6.homework.task8museum;

public abstract class Exhibit {
    private final String description;
    private final String storageConditions;

    public Exhibit(String description, String storageConditions) {
        this.description = description;
        this.storageConditions = storageConditions;
    }

    public abstract void satisfyStorageConditions();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "description='" + description + '\'' +
                ", storageConditions='" + storageConditions + '\'' +
                '}';
    }
}
