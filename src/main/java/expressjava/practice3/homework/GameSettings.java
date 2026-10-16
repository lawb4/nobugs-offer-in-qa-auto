package expressjava.practice3.homework;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.printf("Game name: %s, current players: %d, max players: %d\n", gameName, currentPlayers, maxPlayers);
    }
}
