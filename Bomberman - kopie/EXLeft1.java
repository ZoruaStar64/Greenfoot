import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EXLeft1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EXLeft1 extends Explosion1
{
    private GreenfootImage Leftflame5; private GreenfootImage Leftflame4; private GreenfootImage Leftflame3;
    private GreenfootImage Leftflame2; private GreenfootImage Leftflame1;
    private int animTeller = 0;
    public EXLeft1() {
        Leftflame5 = new GreenfootImage("Leftflame5.png"); Leftflame4 = new GreenfootImage("Leftflame4.png");
        Leftflame3 = new GreenfootImage("Leftflame3.png"); Leftflame2 = new GreenfootImage("Leftflame2.png");
        Leftflame1 = new GreenfootImage("Leftflame1.png");
    }
    protected void left() {
        World world;
        Actor Explosion1;
        
        Explosion1 = getOneObjectAtOffset(0,0, Explosion1.class);
        
        if ((getWorld().getObjects(Explosion1.class).size() >= 1) && animTeller == 0) {
            animTeller = 0;
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Leftflame5 && animTeller == 5) {
            setImage(Leftflame5);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Leftflame4 && animTeller == 10) {
            setImage(Leftflame4);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Leftflame3 && animTeller == 15) {
            setImage(Leftflame3);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Leftflame2 && animTeller == 20) {
            setImage(Leftflame2);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Leftflame1 && animTeller == 25) {
            setImage(Leftflame1);
            
        }
        if (animTeller == 30) {
            getWorld().removeObject(this);
        }
    }
    /**
     * Act - do whatever the EXLeft1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        left();
    }    
}
