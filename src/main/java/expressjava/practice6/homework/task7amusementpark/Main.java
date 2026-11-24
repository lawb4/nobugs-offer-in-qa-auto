package expressjava.practice6.homework.task7amusementpark;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark(new RollerCoaster());
        amusementPark.printInfo();
        amusementPark.control();

        AmusementPark amusementPark1 = new AmusementPark(new Carousel());
        amusementPark1.printInfo();
        amusementPark1.control();
    }
}
