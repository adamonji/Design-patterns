package singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionID = 54651616;

    private int hp;
    private int exp;

//    may that
//    private static GameEngine instance;

    private static GameEngine instance = new GameEngine();

//    private GameEngine(){}

    public static GameEngine getInstanceGame()  {
        return instance;
    }

/*  may that
    public static GameEngine getInstanceGame()  {
        if (instance == null)  {
            synchronized (GameEngine.class)  {
                if (instance == null)  {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }
 */
    protected Object readResolve()  {
        return getInstanceGame();
    }



}
