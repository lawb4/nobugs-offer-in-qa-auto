package expressjava.practice3.homework.test;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }

    void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.printf("Game name: %s, current players: %d, max players: %d\n",
                gameName,
                currentPlayers,
                maxPlayers);
    }
}
