package expressjava.practice6.homework.task3restarurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDish(new MainCourse("100 C"));
        menu.addDish(new Drink("300 ml"));
        menu.print();
    }
}
