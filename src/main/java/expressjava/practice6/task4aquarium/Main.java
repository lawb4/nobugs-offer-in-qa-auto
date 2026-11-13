package expressjava.practice6.task4aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        SeaCreature shark = new Shark();
        aquarium.setSeaCreature(shark);
        aquarium.showSeaCreatureBehavior();

        SeaCreature starfish = new Starfish();
        aquarium.setSeaCreature(starfish);
        aquarium.showSeaCreatureBehavior();
    }
}
