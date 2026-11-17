package expressjava.practice6.homework.task3restaurant;

public class MainCourse extends Dish {

    private final int temperature;

    public MainCourse(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void print() {
        System.out.println("Описание горячего блюда " + this + " с температурой " + temperature);
    }
}
