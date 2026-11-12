package expressjava.practice6.botanicalgarden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();

        Plant orchid = new Orchid();
        botanicalGarden.setPlant(orchid);
        botanicalGarden.provideCare();

        Plant cactus = new Cactus();
        botanicalGarden.setPlant(cactus);
        botanicalGarden.provideCare();
    }
}
