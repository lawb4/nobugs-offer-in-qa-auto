package expressjava.practice6.homework.task8museum;

public class Main {
    public static void main(String[] args) {
        Museum museum1 = new Museum(new Manuscript("Манускрипт со своей историей"));
        museum1.printInfo();
        museum1.control();

        Museum museum2 = new Museum(new Sculpture("Скульптура со своей историей"));
        museum2.printInfo();
        museum2.control();
    }
}
