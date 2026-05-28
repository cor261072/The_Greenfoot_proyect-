
import greenfoot.*;

public class MenuWorld extends World
{
    public MenuWorld()
    {
        super(800, 500, 1);
        showText("TREASURE ESCAPE", 400, 180);
        showText("PRESS ENTER TO START", 400, 260);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
