package expressjava.practice6.amusementpark;

public class Carousel extends Ride {
    @Override
    public void printInfo() {
        System.out.println("Описание карусели c предлагаемыми ощущениями.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Техническое обслуживание карусели проведено.");
    }
}
