package expressjava.practice6.homework.task7amusementpark;

public class RollerCoaster extends Ride{
    @Override
    public void provideMaintenance() {
        System.out.println("Проверка безопасности американских горок проведена");
    }

    @Override
    public void printInfo() {
        System.out.println("Описание американских горок с предлагаемыми ощущениями");
    }
}
