
import greenfoot.*;

public class Player extends Actor
{
    public Player()
    {
        setImage("images/player.png");
    }

    public void act()
    {
        movePlayer();
        collectCoin();
        hitEnemy();
    }

    private void movePlayer()
    {
        if(Greenfoot.isKeyDown("left"))
            setLocation(getX()-5, getY());

        if(Greenfoot.isKeyDown("right"))
            setLocation(getX()+5, getY());

        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY()-5);

        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY()+5);
    }

    private void collectCoin()
    {
        Coin coin = (Coin)getOneIntersectingObject(Coin.class);

        if(coin != null)
        {
            getWorld().removeObject(coin);
            ((GameWorld)getWorld()).updateScore();
        }
    }

    private void hitEnemy()
    {
        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);

        if(enemy != null)
        {
            ((GameWorld)getWorld()).loseLife();
            setLocation(400,420);
        }
    }
}
