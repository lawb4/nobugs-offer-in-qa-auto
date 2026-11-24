package expressjava.practice6.homework.task3restaurant;

public class Drink extends Dish {

    private final int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("Описание напитка " + this + " с объёмом " + volume);
    }
}
