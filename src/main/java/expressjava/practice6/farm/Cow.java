package expressjava.practice6.farm;

public class Cow extends DomesticAnimal {

    public Cow() {
        super("нуждается в выпасе.");
    }

    @Override
    public String function() {
        return "даёт молоко.";
    }

    @Override
    public String toString() {
        return "Корова";
    }
}
