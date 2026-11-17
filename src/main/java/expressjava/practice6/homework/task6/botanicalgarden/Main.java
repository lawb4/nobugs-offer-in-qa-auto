package expressjava.practice6.homework.task6.botanicalgarden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden(new Orchid());
        botanicalGarden.provideCare();
        botanicalGarden.setPlant(new Cactus());
        botanicalGarden.provideCare();
    }
}
