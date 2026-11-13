package expressjava.practice6.task3restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish mainCourse = new MainCourse(100);
        Dish lemonade = new Drink(300);

        menu.addDish(mainCourse);
        menu.addDish(lemonade);

        menu.printMenu();
    }
}