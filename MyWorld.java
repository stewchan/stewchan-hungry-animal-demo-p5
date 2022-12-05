import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    public Label scoreLabel;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Elephant e = new Elephant();
        addObject(e, 100, 300);
        
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 50);
        
        spawnApple();
    }

    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
    }
    
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    public void spawnApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 10;
        addObject(apple, x, y);
    }
}
