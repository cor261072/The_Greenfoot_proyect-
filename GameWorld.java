
import greenfoot.*;

public class GameWorld extends World
{
    private int score = 0;
    private int lives = 3;

    public GameWorld()
    {
        super(800, 500, 1);

        setBackground("images/background.png");

        Player player = new Player();
        addObject(player, 400, 420);

        for(int i = 0; i < 5; i++)
        {
            addObject(new Enemy(),
            Greenfoot.getRandomNumber(750),
            Greenfoot.getRandomNumber(300));
        }

        for(int i = 0; i < 10; i++)
        {
            addObject(new Coin(),
            Greenfoot.getRandomNumber(750),
            Greenfoot.getRandomNumber(350));
        }
    }

    public void updateScore()
    {
        score++;
        showText("SCORE: " + score, 90, 20);

        if(score >= 10)
        {
            Greenfoot.setWorld(new WinWorld(score));
        }
    }

    public void loseLife()
    {
        lives--;
        showText("LIVES: " + lives, 250, 20);

        if(lives <= 0)
        {
            Greenfoot.setWorld(new GameOverWorld(score));
        }
    }
}
