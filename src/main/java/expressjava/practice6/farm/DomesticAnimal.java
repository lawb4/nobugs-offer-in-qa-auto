package expressjava.practice6.farm;

public abstract class DomesticAnimal {
    private final String need;

    protected DomesticAnimal(String need) {
        this.need = need;
    }

    public abstract String function();

    public String getNeed() {
        return need;
    }
}
