import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        int bottomY = getWorld().getHeight();
        if(getY() > bottomY) {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            world.removeObject(this);
        }
    }
}
