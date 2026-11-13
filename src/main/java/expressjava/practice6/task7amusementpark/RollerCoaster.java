package expressjava.practice6.task7amusementpark;

public class RollerCoaster extends Ride {
    @Override
    public void printInfo() {
        System.out.println("Описание американских горок c предлагаемыми ощущениями.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Безопасность американских горок проверена.");
    }
}
