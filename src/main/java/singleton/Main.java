package singleton;

public class Main {
    public static void main(String[] args) {

        GameEngine game1 = GameEngine.getInstanceGame();
        GameEngine game2 = GameEngine.getInstanceGame();
        System.out.println("Are game1 and game2 the same?");
        System.out.println(game1 == game2);

        System.out.println(GameEngineEnum.INSTANCE);





    }
}
