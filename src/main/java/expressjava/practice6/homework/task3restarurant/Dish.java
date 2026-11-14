package expressjava.practice6.homework.task3restarurant;

public abstract class Dish {
    private String parameter;

    public Dish(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public abstract void print();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
