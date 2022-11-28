import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Elephant e = new Elephant();
        addObject(e, 100, 300);
        
        Apple apple = new Apple();
        int x = getWidth()/2;
        int y = 10;
        addObject(apple, x, y);
    }
}
