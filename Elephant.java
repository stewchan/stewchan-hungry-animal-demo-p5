import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    GreenfootSound sound;
    SimpleTimer animTimer = new SimpleTimer();
    GreenfootImage[] images = new GreenfootImage[8];
    
    public Elephant(){
        sound = new GreenfootSound("sounds/elephantcub.mp3");
        
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            images[i].scale(100,100);
        }
        setImage(images[0]);
        
        animTimer.mark();
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
        animate();
    }
    
    int i = 0;
    public void animate(){
        if(animTimer.millisElapsed() > 100){
            setImage(images[i]);
            i = (i + 1) % images.length;
            animTimer.mark();
        }
        
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
