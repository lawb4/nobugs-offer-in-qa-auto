package expressjava.practice6.homework.task3restarurant;

public class Drink extends Dish {

    public Drink(String volume) {
        super(volume);
    }

    @Override
    public void print() {
        System.out.println("Описание напитка " + this + " c объёмом " + super.getParameter());
    }
}
