package expressjava.practice6.homework.task3restarurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(Objects.requireNonNull(dish));
    }

    public void print() {
        for (Dish dish : dishes) {
            dish.print();
        }
    }
}
