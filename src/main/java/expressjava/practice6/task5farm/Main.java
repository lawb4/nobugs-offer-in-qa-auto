package expressjava.practice6.task5farm;

public class Main {
    public static void main(String[] args) {
        Farm farm1 = new Farm(new Cow());
        farm1.control();

        Farm farm2 = new Farm(new Hen());
        farm2.control();
    }
}
