package expressjava.practice6.restaurant;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "This drink's volume is " + volume;
    }
}
