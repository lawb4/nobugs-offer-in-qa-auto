package expressjava.practice6.homework.task1zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setAnimal(new Bird());
        zoo.showBehavior();

        zoo.setAnimal(new Elephant());
        zoo.showBehavior();
    }
}
