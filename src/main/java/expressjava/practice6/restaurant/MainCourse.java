package expressjava.practice6.restaurant;

public class MainCourse extends Dish {
    private int temperature;

    public MainCourse(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "This main course's temperature is " + temperature;
    }
}
