package expressjava.practice6.task7amusementpark;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark1 = new AmusementPark(new RollerCoaster());
        amusementPark1.printInfo();
        amusementPark1.control();

        AmusementPark amusementPark2 = new AmusementPark(new Carousel());
        amusementPark2.printInfo();
        amusementPark2.control();
    }
}
