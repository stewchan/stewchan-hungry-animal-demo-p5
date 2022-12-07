import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound sound;
    
    GreenfootImage[] images = new GreenfootImage[8];
    
    public Elephant(){
        sound = new GreenfootSound("sounds/elephantcub.mp3");
        
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            images[i].scale(100,100);
        }
        
        setImage(images[0]);
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-3);
        }
        
        eat();
    }
    
    public void eat(){
        if(isTouching(Apple.class)){
            // play sound
            sound.play();
            removeTouching(Apple.class);
            
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
}
