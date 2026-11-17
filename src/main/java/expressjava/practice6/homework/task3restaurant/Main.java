package expressjava.practice6.homework.task3restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDish(new MainCourse(100));
        menu.addDish(new Drink(300));
        menu.print();
    }
}
