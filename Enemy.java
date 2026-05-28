
import greenfoot.*;

public class Enemy extends Actor
{
    public Enemy()
    {
        setImage("images/enemy.png");
        turn(Greenfoot.getRandomNumber(360));
    }

    public void act()
    {
        move(2);

        if(isAtEdge())
        {
            turn(180);
        }
    }
}
