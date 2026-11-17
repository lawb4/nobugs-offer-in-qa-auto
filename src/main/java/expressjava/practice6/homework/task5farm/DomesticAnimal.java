package expressjava.practice6.homework.task5farm;

public abstract class DomesticAnimal {
    private final String need;

    protected DomesticAnimal(String need) {
        this.need = need;
    }

    public String getNeed() {
        return need;
    }

    public abstract String function();
}
