package expressjava.practice6.homework.task2pets;

public class Main {
    public static void main(String[] args) {
        PetSystem petSystem = new PetSystem();
        petSystem.setPet(new Dog());
        petSystem.interact();

        petSystem.setPet(new Cat());
        petSystem.interact();
    }
}
