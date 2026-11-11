package expressjava.practice6.pets;

public class Cat extends Pet {
    @Override
    public void act() {
        System.out.println("Кошка играет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест влажный корм");
    }
}
