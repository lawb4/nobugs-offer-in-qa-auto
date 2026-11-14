package expressjava.practice6.homework.task3restarurant;

public class MainCourse extends Dish {

    public MainCourse(String temperature) {
        super(temperature);
    }

    @Override
    public void print() {
        System.out.println("Описание горячего блюда " + this + " с температурой " + super.getParameter());
    }
}
