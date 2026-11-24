package expressjava.practice6.homework.task7amusementpark;

public class Carousel extends Ride{
    @Override
    public void provideMaintenance() {
        System.out.println("Техническое обслуживание карусели проведено");
    }

    @Override
    public void printInfo() {
        System.out.println("Описание карусели с предлагаемыми ощущениями");
    }
}
