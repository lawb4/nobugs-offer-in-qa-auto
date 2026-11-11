package expressjava.practice6.pets;

public class Dog extends Pet {
    @Override
    public void act() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест сухой корм");
    }
}
