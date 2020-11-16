import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueBomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueBomber extends Actor
{
    private GreenfootImage animDown1;
    private GreenfootImage animLeft1;
    private GreenfootImage animRight1;
    private GreenfootImage animUp1;
    private int bomteller = 0;
    public BlueBomber()
    {
        animDown1 = new GreenfootImage("BlueDown1.png"); 
        animLeft1 = new GreenfootImage("BlueLeft1.png");
        animRight1 = new GreenfootImage("BlueRight1.png"); 
        animUp1 = new GreenfootImage("BlueUp1.png");
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
    protected void placeBomb() {
        World world;
        Actor BombB;
        
        if(Greenfoot.isKeyDown("space") && (getWorld().getObjects(BombB.class).size() < 1)
        && bomteller >= 60) {
            
            getWorld().addObject(new BombB(), getX(), getY());
            bomteller = 0;
        }

    }
    protected void movingAndTurning()
    {
        if(Greenfoot.isKeyDown("A")) {
            if(getImage() != animLeft1) {
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
        if(Greenfoot.isKeyDown("D")) {
            if(getImage() != animRight1) {
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
        if(Greenfoot.isKeyDown("W")) {
            if(getImage() != animUp1) {
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

        if(Greenfoot.isKeyDown("S")) {
            if(getImage() != animDown1) {
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
        bomteller++;
        movingAndTurning();
        placeBomb();
    }    
}
