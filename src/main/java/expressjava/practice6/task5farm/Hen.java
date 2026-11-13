package expressjava.practice6.task5farm;

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
