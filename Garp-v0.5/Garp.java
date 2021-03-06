import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garp extends Actor
{
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;
    
    public Garp()
    {
        imageLeft = new GreenfootImage("GarpLeft.png"); 
        imageRight = new GreenfootImage("GarpRight.png"); 
        setImage(imageRight);

    }
    protected boolean foundRock() {
        Actor rock;
        rock = getOneObjectAtOffset(0, 0, Rock.class);
        if(rock != null) {
            return true;
        }
        return false;
    }
    protected void collectingDiamonds()
    {
        World world;
        Actor diamond;
        diamond = getOneObjectAtOffset(0, 0, Diamond.class);
        if(diamond != null) {
            world = getWorld();
            world.removeObject(diamond);
        }
    }
    public void foundBomb()
    {
        Actor Bomb;
        
        Bomb = getOneObjectAtOffset(0,0, Bomb.class);
        if(Bomb != null) {
            getWorld().removeObject(Bomb);
            getWorld().addObject(new explosion(),getX(), getY());
            getWorld().removeObject(this);
        }
    }
    protected void movingAndTurning()
    {
        if(Greenfoot.isKeyDown("left")) {
            if(getImage() == imageRight) {
                setImage(imageLeft);
            }
            setRotation(0);
            move(-5);
             if(foundRock()) {
                 move(5);
            }
        }
        if(Greenfoot.isKeyDown("right")) {
            if(getImage() == imageLeft) {
                setImage(imageRight);
            }
            setRotation(0);
            move(5);
             if(foundRock()) {
                 move(-5);
            }
        }
        if(Greenfoot.isKeyDown("up")) {
            if(getImage() == imageLeft) {
                setImage(imageRight);
            }
            setRotation(-90);
            move(5);
             if(foundRock()) {
                 move(-5);
            }
        }

        if(Greenfoot.isKeyDown("down")) {
            if(getImage() == imageLeft) {
                setImage(imageRight);
            }
            setRotation(90);
            move(5);
             if(foundRock()) {
                 move(-5);
            }
        }
    }
    
    /**
     * Act - do whatever the Garp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movingAndTurning();
        collectingDiamonds();
        foundBomb();
    }    
}
