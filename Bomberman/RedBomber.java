import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueBomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBomber extends Actor
{
    private GreenfootImage animDown1;
    private GreenfootImage animLeft1;
    private GreenfootImage animRight1;
    private GreenfootImage animUp1;
    public RedBomber()
    {
        animDown1 = new GreenfootImage("RedDown1.png"); 
        animLeft1 = new GreenfootImage("RedLeft1.png");
        animRight1 = new GreenfootImage("RedRight1.png"); 
        animUp1 = new GreenfootImage("RedUp1.png");
        setImage(animDown1);

    }
    protected boolean foundUnbreakableBlock() {
        Actor UnbreakableBlock;
        UnbreakableBlock = getOneObjectAtOffset(0, 0, UnbreakableBlock.class);
        if(UnbreakableBlock != null) {
            return true;
        }
        return false;
    }
    protected boolean foundBreakableBlock() {
        Actor BreakableBlock;
        BreakableBlock = getOneObjectAtOffset(0, 0, BreakableBlock.class);
        if(BreakableBlock != null) {
            return true;
        }
        return false;
    }
    public void placeBomb() {
        World world;
        Actor BombR;
        
        if(Greenfoot.isKeyDown("enter") && (getWorld().getObjects(BombR.class).size() < 4)) {
            
            getWorld().addObject(new BombR(), getX(), getY());
        }
        if(Greenfoot.isKeyDown("enter") && (getWorld().getObjects(BombR.class).size() == 4)) {
            move(0);
        }
    }
    protected void movingAndTurning()
    {
        if(Greenfoot.isKeyDown("left")) {
            if(getImage() == animRight1) {
                setImage(animLeft1);
            }
            if(getImage() == animUp1) {
                setImage(animLeft1);
            }
            if(getImage() == animDown1) {
                setImage(animLeft1);
            }
            setRotation(0);
            move(-5);
             if(foundUnbreakableBlock()) {
                 move(5);
            }
              if(foundBreakableBlock()) {
                 move(5);
            }
        }
        if(Greenfoot.isKeyDown("right")) {
            if(getImage() == animLeft1) {
                setImage(animRight1);
            }
            if(getImage() == animUp1) {
                setImage(animRight1);
            }
            if(getImage() == animDown1) {
                setImage(animRight1);
            }
            setRotation(0);
            move(5);
             if(foundUnbreakableBlock()) {
                 move(-5);
            }
              if(foundBreakableBlock()) {
                 move(-5);
            }
        }
        if(Greenfoot.isKeyDown("up")) {
            if(getImage() == animLeft1) {
                setImage(animUp1);
                
            }
            if(getImage() == animRight1) {
                setImage(animUp1);
                
            }
            if(getImage() == animDown1) {
                setImage(animUp1); 
                
            }
            setRotation(-90);
            move(5);
                 if(foundUnbreakableBlock()) {
                 move(-5);
            }
              if(foundBreakableBlock()) {
                 move(-5);
            }
            setRotation(0);
        
        }

        if(Greenfoot.isKeyDown("down")) {
            if(getImage() == animLeft1) {
                setImage(animDown1);
                
            }
            if(getImage() == animUp1) {
                setImage(animDown1);
                
            }
            if(getImage() == animRight1) {
                setImage(animDown1);
                
            }
            setRotation(90);
            move(5);
             if(foundUnbreakableBlock()) {
                 move(-5);
            }
              if(foundBreakableBlock()) {
                 move(-5);
            }
            setRotation(0);
            
        }
    }
    
    /**
     * Act - do whatever the BlueBomber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movingAndTurning();
        placeBomb();
     }    
}
