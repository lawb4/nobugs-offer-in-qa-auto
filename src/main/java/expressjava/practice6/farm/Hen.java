package expressjava.practice6.farm;

public class Hen extends DomesticAnimal {

    public Hen() {
        super("требует зерно.");
    }

    @Override
    public String function() {
        return "несёт яйца.";
    }

    @Override
    public String toString() {
        return "Курица";
    }
}
