import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombB extends Actor
{
    private GreenfootImage animBomb1;
    private GreenfootImage animBomb2;
    private GreenfootImage animBomb3;
    private GreenfootImage animBomb4;
    private int animTeller = 0;
    private int explosionCounter = 0;
    public BombB() {
        animBomb1 = new GreenfootImage("Bomb1.png");
        animBomb2 = new GreenfootImage("Bomb2.png");
        animBomb3 = new GreenfootImage("Bomb3.png");
        animBomb4 = new GreenfootImage("Bomb4.png");
        setImage(animBomb1);
    }
    
    protected void animationBomb() {
        World world;
        Actor BombB;
        
        BombB = getOneObjectAtOffset(0,0, BombB.class);
        if (Greenfoot.isKeyDown("space") && ((getWorld().getObjects(BombB.class).size() == 0))) {
            animTeller = 0;
            explosionCounter = 0;
        }
        if (((getWorld().getObjects(BombB.class).size() > 0)) && getImage() != animBomb2 && animTeller == 30) {
            setImage(animBomb2);
            
        }
        if (((getWorld().getObjects(BombB.class).size() > 0)) && getImage() != animBomb3 && animTeller == 60) {
            setImage(animBomb3);
            
        }
        if (((getWorld().getObjects(BombB.class).size() > 0)) && getImage() != animBomb4 && animTeller == 90) {
            setImage(animBomb4);
            
        }
        if (((getWorld().getObjects(BombB.class).size() > 0)) && getImage() != animBomb1 && animTeller == 120) {
            setImage(animBomb1);
            animTeller = 0;
        }
        if (explosionCounter == 360) {
            
            getWorld().addObject(new Explosion1(),getX(), getY());
            getWorld().removeObject(this);
            System.out.println("" + explosionCounter);
        }
    }
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        explosionCounter++;
        animTeller++;
        animationBomb();
        
    }    
}
