package expressjava.practice6.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {
    private final List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(Objects.requireNonNull(dish));
    }

    public void printMenu() {
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }
}
