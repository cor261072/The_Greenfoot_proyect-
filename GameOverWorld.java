
import greenfoot.*;

public class GameOverWorld extends World
{
    public GameOverWorld(int score)
    {
        super(800,500,1);

        showText("GAME OVER", 400, 180);
        showText("FINAL SCORE: " + score, 400, 250);
    }
}
