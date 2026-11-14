package expressjava.practice6.homework.task2pets;

public class Dog extends Pet {
    @Override
    public void act() {
        System.out.println("Собака гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Собака есь сухой корм");
    }
}
