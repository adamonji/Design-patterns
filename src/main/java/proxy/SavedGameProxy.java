package proxy;

public class SavedGameProxy implements SavedGame{

    private SavedGame sg;  //SavedGamesFull
    private String name;

    @Override
    public void initialize() {
        this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
