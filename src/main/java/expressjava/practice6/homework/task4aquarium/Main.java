package expressjava.practice6.homework.task4aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.setSeaCreature(new Shark());
        aquarium.showBehavior();

        aquarium.setSeaCreature(new Starfish());
        aquarium.showBehavior();
    }
}
