import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion1 extends Actor
{
    private GreenfootImage Topflame5;
    private GreenfootImage Bottomflame5;
    
    private GreenfootImage Leftflame5; private GreenfootImage Leftflame4; private GreenfootImage Leftflame3;
    private GreenfootImage Leftflame2; private GreenfootImage Leftflame1;
    
    private GreenfootImage Rightflame5;
    private GreenfootImage Middleflame1;
    private GreenfootImage Horizontalflame5;
    private GreenfootImage Verticleflame5;
    private GreenfootImage Middlecharged5;private GreenfootImage Middlecharged4;private GreenfootImage Middlecharged3;
    private GreenfootImage Middlecharged2;private GreenfootImage Middlecharged1;
    private int animTeller = 0;
    private EXLeft1 exLeft1;
    public Explosion1() {
        // BELANGRIJK!
        // ALLE VLAMMEN ZIJN OP OMGEKEERDE STERKTE VAN HUN NUMMER BEHALVE MIDDLEFLAME!!!
        // Update: Middleflame is juist voor wanneer een power-up opgeblazen wordt
        Topflame5 = new GreenfootImage("Topflame5.png");
        Bottomflame5 = new GreenfootImage("Bottomflame5.png");
        
        Leftflame5 = new GreenfootImage("Leftflame5.png"); Leftflame4 = new GreenfootImage("Leftflame4.png");
        Leftflame3 = new GreenfootImage("Leftflame3.png"); Leftflame2 = new GreenfootImage("Leftflame2.png");
        Leftflame1 = new GreenfootImage("Leftflame1.png");
        
        Rightflame5 = new GreenfootImage("Rightflame5.png");
        Middleflame1 = new GreenfootImage("Middleflame1.png");
        Horizontalflame5 = new GreenfootImage("Horizontalflame5.png");
        Verticleflame5 = new GreenfootImage("Verticleflame5.png");
        
        Middlecharged5 = new GreenfootImage("Middlecharged5.png");Middlecharged4 = new GreenfootImage("Middlecharged4.png");
        Middlecharged3 = new GreenfootImage("Middlecharged3.png");Middlecharged2 = new GreenfootImage("Middlecharged2.png");
        Middlecharged1 = new GreenfootImage("Middlecharged1.png");
        exLeft1 = new EXLeft1();
    }
    
    protected void core() {
        World world;
        Actor Explosion1;
        
        Explosion1 = getOneObjectAtOffset(0,0, Explosion1.class);

        if ((getWorld().getObjects(Explosion1.class).size() >= 1) && animTeller == 0) {
            animTeller = 0;
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Middlecharged5 && animTeller == 5) {
            setImage(Middlecharged5);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Middlecharged4 && animTeller == 10) {
            setImage(Middlecharged4);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Middlecharged3 && animTeller == 15) {
            setImage(Middlecharged3);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Middlecharged2 && animTeller == 20) {
            setImage(Middlecharged2);
            
        }
        if (((getWorld().getObjects(Explosion1.class).size() > 0)) && getImage() != Middlecharged1 && animTeller == 25) {
            setImage(Middlecharged1);
            
        }
        if (animTeller == 30) {
            getWorld().removeObject(this);
        }
    }
    
    /*protected void left() {
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
    */
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animTeller++;
        core();
        
        System.out.println("" + animTeller);
    }
}