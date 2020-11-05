import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosion extends Actor
{
           
    private GreenfootImage[] images;
            
    /**
     * Act - do whatever the explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }  
    public explosion(){
        int size = 0, baseSize, verschil, teller;
        GreenfootImage baseImage = new GreenfootImage("explosion.png");
        baseSize = baseImage.getWidth();
        images = new GreenfootImage[8];
        verschil = baseSize / 8;
        int increment = 1;
        size = 0;
        for(teller = 0; teller < 8; teller++){
            size += verschil;
            images[teller] = new GreenfootImage(baseImage);
            images[teller].scale(size, size);
        }
    }
}
