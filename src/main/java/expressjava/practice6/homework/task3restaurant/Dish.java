package expressjava.practice6.homework.task3restaurant;

public abstract class Dish {

    public abstract void print();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
