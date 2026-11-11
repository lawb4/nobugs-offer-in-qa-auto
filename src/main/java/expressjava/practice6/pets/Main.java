package expressjava.practice6.pets;

public class Main {
    public static void main(String[] args) {
        PetSystem petSystem = new PetSystem();

        Pet dog = new Dog();
        petSystem.setPet(dog);
        petSystem.interact();

        Pet cat = new Cat();
        petSystem.setPet(cat);
        petSystem.interact();
    }
}
