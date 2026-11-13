package expressjava.practice6.task1zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo.setAnimal(elephant);
        zoo.showBehavior();

        zoo.setAnimal(bird);
        zoo.showBehavior();
    }
}
