import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion2 extends Actor
{
    private GreenfootImage Topflame5;
    private GreenfootImage Bottomflame5;
    private GreenfootImage Leftflame5;
    private GreenfootImage Rightflame5;
    private GreenfootImage Middleflame1;
    private GreenfootImage Horizontalflame5;
    private GreenfootImage Verticleflame5;
    private GreenfootImage Middlecharged5;
    public Explosion2() {
        // BELANGRIJK!
        // ALLE VLAMMEN ZIJN OP OMGEKEERDE STERKTE VAN HUN NUMMER BEHALVE MIDDLEFLAME!!!
        Topflame5 = new GreenfootImage("Topflame5.png");
        Bottomflame5 = new GreenfootImage("Bottomflame5.png");
        Leftflame5 = new GreenfootImage("Leftflame5.png");
        Rightflame5 = new GreenfootImage("Rightflame5.png");
        Middleflame1 = new GreenfootImage("Middleflame1.png");
        Horizontalflame5 = new GreenfootImage("Horizontalflame5.png");
        Verticleflame5 = new GreenfootImage("Verticleflame5.png");
        Middlecharged5 = new GreenfootImage("Middlecharged5.png");
    }
    
    protected void unchargedBoom() {
        World world;
        Actor Explosion2;
        
        Explosion2 = getOneObjectAtOffset(0,0, Explosion2.class);
        setImage(Middleflame1);
        
        
        
        /*if (Greenfoot.isKeyDown("space") && ((getWorld().getObjects(BombB.class).size() == 0))) {
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
        }*/
       
    }
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        unchargedBoom();
    }
}
