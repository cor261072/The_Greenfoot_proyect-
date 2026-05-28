
import greenfoot.*;

public class WinWorld extends World
{
    public WinWorld(int score)
    {
        super(800,500,1);

        showText("YOU WIN!", 400, 180);
        showText("FINAL SCORE: " + score, 400, 250);
    }
}
