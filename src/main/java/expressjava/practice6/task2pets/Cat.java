package expressjava.practice6.task2pets;

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
