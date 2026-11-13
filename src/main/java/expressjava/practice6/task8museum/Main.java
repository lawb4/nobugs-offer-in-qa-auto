package expressjava.practice6.task8museum;

public class Main {
    public static void main(String[] args) {
        Museum museum1 = new Museum(new Manuscript());
        museum1.printInfo();
        museum1.control();

        Museum museum2 = new Museum(new Sculpture());
        museum2.printInfo();
        museum2.control();
    }
}
