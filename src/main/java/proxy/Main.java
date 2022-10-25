package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SavedGame>savedGames = loadSavedGames();
        listSavedGames(savedGames);
    }

    private static List<SavedGame> loadSavedGames() {
        int savedGamesCount = 20;
        List<SavedGame> saveGames = new ArrayList<>();
        for(int i = 0; i < 20; i++)  {
            SavedGame sg = new SavedGameProxy();
            sg.initialize();
            saveGames.add(sg);
        }
        return saveGames;
    }
    private static void listSavedGames(List<SavedGame> savedGames) {
        for(SavedGame savedGame : savedGames)  {
            System.out.println(savedGame.getName());
        }
    }
}
